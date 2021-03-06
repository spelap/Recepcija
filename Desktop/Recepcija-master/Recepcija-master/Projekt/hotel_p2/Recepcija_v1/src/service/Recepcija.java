package service;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.cistilniservis.Narocilo;
import org.datacontract.schemas._2004._07.hotel_p1_rezervacijasob.ArrayOfRezervacija;
import org.datacontract.schemas._2004._07.hotel_p1_rezervacijasob.Rezervacija;
import org.tempuriCistilnica.IService1;
import org.tempuriCistilnica.IService1PotrdiOpravljenoNarociloFaultExceptionFaultFaultMessage;
import org.tempuriCistilnica.Service1;
import org.tempuriRezervacija.VrniRezervacije;
import org.tempuriRezervacija.VrniRezervacijeResponse;

import data.DAO;
import data.Gost;
import data.Oseba;
import data.Racun;
import data.Soba;
import data.Storitev;
import service.IRecepcija;

@WebService(endpointInterface="service.IRecepcija")
public class Recepcija implements IRecepcija {
	
	
	/* (non-Javadoc)
	 * @see IRecepcija#dodajNaRacun(double, Gost, java.lang.String, java.util.Date, java.lang.String)
	 */
	
	@Override
	public String dodajNaRacun(BigDecimal znesek, String emso, String storitev, String datum, String sifra){
		try{
			DAO d=new DAO();
			Racun racun=d.vrniGostovRacun(emso);
			
			BigDecimal bd = racun.getZnesek();
			BigDecimal novi_znesek=bd.add(znesek);
			racun.setZnesek(novi_znesek);
			
			Storitev s=new Storitev();
			s.setDatum(datum);
			s.setNaziv(storitev);
			s.setZnesek(znesek);
	
			d.posodobiRacun(racun, s);
			
			return "Storitev dodana na ra�un.";
		}catch(Exception e){
			System.out.println(e.getMessage());
			return "Pri�lo je do napake.";
		}
		
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#dodeliSobo(java.util.ArrayList, int)
	 */
	@Override
	public String dodeliSobo(ArrayList<Oseba> osebe, int rezervacijska_stevilka){
		String odgovor="Soba ni bila dodeljena";
		if(rezervacijska_stevilka==0){
			
			try{
				Date today=new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
				String danes=sdf.format(today);
				
				DAO d=new DAO();

				ArrayList<Soba> sobe=d.vrniVseProsteSobe();
				Soba soba=new Soba();
				int j=0;
				if(sobe.size()>0){
					for(int i=0; i<osebe.size(); i++){
						Oseba o=osebe.get(i);
						while(j<sobe.size()){
							soba=sobe.get(j);
							int mesta=soba.getSt_postelj();
							if((mesta>0)&&(soba.getRang_kakovosti().equals(o.getKakovost()))){
								mesta=mesta-1;
								Gost g=new Gost();
								g.setIme(o.getIme());
								g.setPriimek(o.getPriimek());
								g.setDatum_rojstva(o.getDatum_rojstva());
								g.setDavcna_st(o.getDavcna_st());
								g.setEmso(o.getEmso());
								g.setStarost(o.getStarost());
								g.setDan_prihoda(danes);
								g.setDan_odhoda(o.getDan_odhoda());
								g.setRezevacijska_st("0");
								g.setZajtrk(o.isZajtrk());
								g.setVecerja(o.isVecerja());
								g.setKosilo(o.isKosilo());
								g.setWellness(o.isWellness());
								g.setSt_sobe(soba);
								
								Racun racun= new Racun();
								racun.setDatum_odprtja(danes);
								racun.setZnesek(new BigDecimal(0));
								
								int st_racuna=d.vnesiRacun(racun);
								racun.setSt_racuna(st_racuna);
								g.setRacun(racun);
								
								d.vnesiGosta(g);
								d.setZasedena(soba.getSt_sobe());
								odgovor="Soba je bila dodeljena.";
								break;
							}else{
								j++;
							}
						}
					}
						
				}else{
					System.out.print("Vse sobe so zasedene!");
				}

			}catch(Exception e){
				System.out.println(e.getMessage());
				odgovor=e.getMessage();
			}
		}else{
			odgovor="Soba je bila dodeljena.";
			VrniRezervacijeResponse vr=new VrniRezervacijeResponse();
			JAXBElement<ArrayOfRezervacija> rezervacije=vr.getVrniRezervacijeResult();
			ArrayOfRezervacija rezer=rezervacije.getValue();
			System.out.println(rezer.getRezervacija().get(0).getRezervacijskaStevilka());
			
		}
		
		return odgovor;
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#odjaviSobo(int)
	 */
	@Override
	public String odjaviSobo(int st_sobe){
		Service1 cist=new Service1();
		IService1 cistilnica=cist.getBasicHttpBindingIService1();
		
		BigDecimal znesek=new BigDecimal(0);
		
		String odgovor;
		try{
			DAO d=new DAO();
			ArrayList<Gost> gostiIzSobe=d.vrniGosteIzSobe(st_sobe);
			for (Gost g: gostiIzSobe){
				int starost=g.getStarost();
				if(starost<18){
					double polovicna=(g.getSoba().getCena())/2;
					znesek=znesek.add(new BigDecimal(polovicna));
					if(g.isZajtrk()){
						znesek=znesek.add(new BigDecimal(4));
					}
					if(g.isKosilo()){
						znesek=znesek.add(new BigDecimal(7.5));
					}
					if(g.isVecerja()){
						znesek=znesek.add(new BigDecimal(6));
					}
					if(g.isWellness()){
						znesek=znesek.add(new BigDecimal(10));
					}
				}
				else{
					znesek=znesek.add(new BigDecimal(g.getSoba().getCena()));
					if(g.isZajtrk()){
						BigDecimal bd=new BigDecimal(8);
						znesek=znesek.add(bd);
					}
					if(g.isKosilo()){
						znesek=znesek.add(new BigDecimal(15));
					}
					if(g.isVecerja()){
						znesek=znesek.add(new BigDecimal(12));
					}
					if(g.isWellness()){
						znesek=znesek.add(new BigDecimal(20));
					}
				}
				
				
				Calendar cal1 = new GregorianCalendar();
			     Calendar cal2 = Calendar.getInstance();
			     Date odhod=(Date) cal2.getTime();

			     SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			     Date prihod = (Date) sdf.parse(g.getDan_prihoda());
			     cal1.setTime(prihod);

			    int dnevi= (int)( (odhod.getTime() - prihod.getTime()) / (1000 * 60 * 60 * 24));
				znesek=znesek.multiply(new BigDecimal(dnevi));
				
			}
			d.sprostiSobo(st_sobe);
			Racun r=d.odjaviGosta(st_sobe);
			znesek=znesek.add(r.getZnesek());
			
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR, +1);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(cal.getTime());
			XMLGregorianCalendar danes = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			
			
			Narocilo n=cistilnica.narociCiscenje(st_sobe, "Po�isti sobo "+st_sobe, danes); //NARO�I �I��ENJE SOBE
			System.out.println("Naro�eno je �i��enje za sobo "+n.getIdProstora());
			
			odgovor="Gost odjavljen. Pla�ati mora: "+znesek+" �";
		}catch(Exception e){
			System.out.println(e.getMessage());
			odgovor=e.getMessage();
		}
		return odgovor;
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#preveriRazpolozljivostSobe(int, java.util.Date, java.util.Date)
	 */
	@Override
	public String preveriRazpolozljivostSobe(int st_sobe){
		DAO d=new DAO();
		if(d.zasedenostSobe(st_sobe)){
			return "Zasedena";
		}else{
			return "Prosta";
		}
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#sporociSteviloProstihSob()
	 */
	@Override
	public int sporociSteviloProstihSob(){
		DAO d=new DAO();
		ArrayList<Soba> sobe=d.vrniVseProsteSobe();
		return sobe.size();
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#aliJeGost(Oseba)
	 */
	@Override
	public boolean aliJeGost(String emso){
		
		DAO d=new DAO();
		Gost g=d.vrniGosta(emso);
		if(g==null){
			return false;
		}else{
			return true;
		}
		
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#vrniVseGoste()
	 */
	@Override
	public ArrayList<Gost> vrniVseGoste(){
		DAO d=new DAO();
		ArrayList<Gost> gosti=d.vrniVseTrenutneGoste();
		return gosti;
	}


	@Override
	public String preveriPaket(String emso) {
		DAO d=new DAO();
		Gost g=d.vrniGosta(emso);
		if(g.isWellness()){
			return "Polni";
		}else{
			return "Osnovni";
		}
	}

	@Override
	public String SporociOpravljenoNarocilo(int idNarocila) {		
		Service1 cist=new Service1();
		IService1 cistilnica=cist.getBasicHttpBindingIService1();
		try {
			cistilnica.potrdiOpravljenoNarocilo(idNarocila);
		} catch (IService1PotrdiOpravljenoNarociloFaultExceptionFaultFaultMessage e) {
			e.printStackTrace();
		}
		return "Narocilo "+ idNarocila+" je bilo opravljeno.";
	}

	@Override
	public String vrniNapako() {
		DAO d=new DAO();
		return d.getError();
	}

	@Override
	public ArrayList<Soba> vrniVseSobe() {
		DAO d=new DAO();
		ArrayList<Soba> sobe=d.vrniVseSobe();
		return sobe;
	}
}
