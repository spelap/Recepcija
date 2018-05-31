package service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo;
import org.json.JSONObject;
import org.tempuriCistilnica.IService1;
import org.tempuriCistilnica.Service1Locator;
import org.tempuriRezervacija.IRezervacijaSob;
import org.tempuriRezervacija.RezervacijaSobLocator;

import data.DAO;
import data.Gost;
import data.Oseba;
import data.Racun;
import data.Soba;
import data.Storitev;
import message.Send;
//import message.Send;
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
			return "Pri�lo je do napake. Preveri ce je vnesen pravi emso!";
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
						Gost gost=d.vrniGosta(o.getEmso());
						if(gost==null){
							while(j<sobe.size()){
								soba=sobe.get(j);
								int mesta=soba.getSt_postelj();
								if((mesta>0)&&(soba.getRang_kakovosti().equals(o.getKakovost()))){
									mesta=mesta-1;
									
									/*________________________POSREDOVANJE REZERVACIJI________________________________________________*/
									int tipSt=1;
									String tip=o.getKakovost();
									switch(tip){
										case "Prvi":tipSt=1; break;
										case "Drugi":tipSt=2; break;
										case "Tretji":tipSt=3;break;
										default: tipSt=1; break;
									}
									RezervacijaSobLocator rs=new RezervacijaSobLocator();
									IRezervacijaSob rezervacija=rs.getBasicHttpBinding_IRezervacijaSob();
									org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba osebaRez=new org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba();

									osebaRez.setIme(o.getIme());
									String prilagojen = (o.getDatum_rojstva()).replace('.', '/');
									osebaRez.setDatumRojstva(prilagojen);
									osebaRez.setEmso(o.getEmso());
									osebaRez.setPriimek(o.getPriimek());
					
									org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija r1=rezervacija.rezervirajSobo(danes, o.getDan_odhoda(), tipSt, o.getKakovost(), o.isZajtrk(), o.isKosilo(), o.isVecerja(), o.isWellness(), osebaRez, 0, 1, Integer.toString(0), "Prijava preko recepcije");
									/*________________________POSREDOVANJE REZERVACIJI________________________________________________*/
									
									Gost g=new Gost();
									g.setIme(o.getIme());
									g.setPriimek(o.getPriimek());
									g.setDatum_rojstva(o.getDatum_rojstva());
									g.setDavcna_st(o.getDavcna_st());
									g.setEmso(o.getEmso());
									g.setStarost(o.getStarost());
									g.setDan_prihoda(danes);
									g.setDan_odhoda(o.getDan_odhoda());
									g.setRezevacijska_st(r1.getRezervacijskaStevilka());
									g.setZajtrk(o.isZajtrk());
									g.setVecerja(o.isVecerja());
									g.setKosilo(o.isKosilo());
									g.setWellness(o.isWellness());
									g.setKupon(o.getKupon());
									g.setSt_sobe(soba);
									
									Racun racun= new Racun();
									racun.setDatum_odprtja(danes);
									racun.setZnesek(new BigDecimal(0));
									
									int st_racuna=d.vnesiRacun(racun);
									racun.setSt_racuna(st_racuna);
									g.setRacun(racun);
									
									d.vnesiGosta(g);
									d.setZasedena(soba.getSt_sobe());
									odgovor="Soba je bila dodeljena. Stevilka sobe "+soba.getSt_sobe();
									
									Send send=new Send();
									send.poslji_sporocilo_emso(o.getEmso());
									
									break;
								}else{
									j++;
									odgovor="Ni ve� sob v tem rangu";
								}
							}
						}else{
							odgovor="Ta oseba je �e prijavljena!";
						}
					}	
				}else{
					odgovor="Vse sobe so zasedene!";
				}

			}catch(Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace(System.out);
				odgovor=e.getMessage();
			}
		}else{
			
			try {
			RezervacijaSobLocator rs=new RezervacijaSobLocator();
			IRezervacijaSob rezervacija=rs.getBasicHttpBinding_IRezervacijaSob();
			
				String st=Integer.toString(rezervacijska_stevilka);
				org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija r=rezervacija.vrniRezervacijo(st);
				String tipOp="Prvi";
				int tip=r.getTipSobe();
				switch(tip){
					case 1:tipOp="Prvi"; break;
					case 2:tipOp="Drugi"; break;
					case 3:tipOp="Tretji";break;
					default: tipOp="Prvi"; break;
				}
					
				
				org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba oseba=r.getNosilec();
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
							Gost gost=d.vrniGosta(oseba.getEmso());
							if(gost==null){
								while(j<sobe.size()){
									soba=sobe.get(j);
									int mesta=soba.getSt_postelj();
									if((mesta>0)&&(soba.getRang_kakovosti().equals(tipOp))){
										mesta=mesta-1;
										Gost g=new Gost();
										g.setIme(oseba.getIme());
										g.setPriimek(oseba.getPriimek());
										g.setDatum_rojstva(oseba.getDatumRojstva());
										g.setDavcna_st(00000000);
										g.setEmso(oseba.getEmso());
										
										Calendar now = Calendar.getInstance();
										Calendar bday = Calendar.getInstance();
										SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
										bday.setTime(format.parse(oseba.getDatumRojstva()));
										
										int year1 = now.get(Calendar.YEAR);
										int year2 = bday.get(Calendar.YEAR);
										int age = year1 - year2;
										int month1 = now.get(Calendar.MONTH);
										int month2 = bday.get(Calendar.MONTH);
										if (month2 > month1) {
										  age--;
										} else if (month1 == month2) {
										  int day1 = now.get(Calendar.DAY_OF_MONTH);
										  int day2 = bday.get(Calendar.DAY_OF_MONTH);
										  if (day2 > day1) {
										    age--;
										  }
										}
										
										g.setStarost(age);
										g.setDan_prihoda(danes);
										g.setDan_odhoda("28.2.2018");
										g.setRezevacijska_st(r.getRezervacijskaStevilka());
										g.setZajtrk(r.getZajtrk());
										g.setVecerja(r.getVecerja());
										g.setKosilo(r.getKosilo());
										g.setWellness(r.getWellness());
										g.setKupon(r.getStevilkaKupona());
										g.setSt_sobe(soba);
										
										Racun racun= new Racun();
										racun.setDatum_odprtja(danes);
										racun.setZnesek(new BigDecimal(0));
										
										int st_racuna=d.vnesiRacun(racun);
										racun.setSt_racuna(st_racuna);
										g.setRacun(racun);
										
										d.vnesiGosta(g);
										d.setZasedena(soba.getSt_sobe());
										odgovor="Soba je bila dodeljena. Stevilka sobe "+soba.getSt_sobe();
										
										Send send=new Send();
										send.poslji_sporocilo_emso(oseba.getEmso());
										
										break;
									}else{
										j++;
										odgovor="Ni ve� sob v tem rangu";
									}
								}
							}else{
								odgovor="Ta oseba je �e prijavljena!";
							}
						}	
					}else{
						odgovor="Vse sobe so zasedene!";
					}

				}catch(Exception e){
					System.out.println(e.getMessage());
					odgovor=e.getMessage();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		return odgovor;
	}
	
	/* (non-Javadoc)
	 * @see IRecepcija#odjaviSobo(int)
	 */
	@Override
	public String odjaviSobo(int st_sobe){
		Service1Locator cist=new Service1Locator();
		String odgovor="Gost ni odjavljen.";
		try{
			IService1 cistilnica=cist.getBasicHttpBinding_IService1();
		
			BigDecimal znesek=new BigDecimal(0);
			Boolean kupon_c=false;
			
		
			DAO d=new DAO();
			ArrayList<Gost> gostiIzSobe=d.vrniGosteIzSobe(st_sobe);
			if(gostiIzSobe.size()>0){
			for (Gost g: gostiIzSobe){
				int starost=g.getStarost();
				if((g.getKupon().toLowerCase()).equals("ceneje")){
					kupon_c=true;
				}
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
				else if((g.getKupon().toLowerCase()).equals("wellness")){
					znesek=znesek.add(new BigDecimal(g.getSoba().getCena()));
					if(g.isZajtrk()){
						znesek=znesek.add(new BigDecimal(8));
					}
					if(g.isKosilo()){
						znesek=znesek.add(new BigDecimal(15));
					}
					if(g.isVecerja()){
						znesek=znesek.add(new BigDecimal(12));
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
			
			if(kupon_c){
				BigDecimal odbitek=(znesek.multiply(new BigDecimal(20))).divide(new BigDecimal(100));
				znesek=znesek.subtract(odbitek);
				odgovor=odgovor+" Upo�tevan je bil kupon 'Ceneje'.";
			}
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR, +2);
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(cal.getTime());
			
			Narocilo n=cistilnica.narociCiscenje(st_sobe, "Po�isti sobo "+st_sobe, c); //NARO�I �I��ENJE SOBE
			System.out.println("Naro�eno je �i��enje za sobo "+n.getIdProstora());
			
			Send send=new Send();
			send.poslji_sporocilo_ciscenje(st_sobe);
			

			odgovor="Gost odjavljen. Pla�ati mora: "+znesek+" �.\n Dodatne storitve: \n";
			ArrayList<Storitev> storitve=d.vrniVseStoritve(r.getSt_racuna());
			for (Storitev s: storitve){
				odgovor=odgovor+(s.getNaziv()+": "+s.getZnesek().doubleValue()+"\n");
			}
		}else{
			odgovor="Soba ni zasedena";
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
			odgovor=e.getStackTrace().toString();
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
		try{
		
			//ODJEMALEC REST
			ClientBuilder cBuilder= ClientBuilder.newBuilder();
			Client odjemalec = cBuilder.newClient();
			WebTarget storitev =
			odjemalec.target("http://soa.informatika.uni-mb.si/P9_CistilniServis/v1rest/Service1.svc");
			WebTarget studentRest = storitev.path("Narocila/"+idNarocila+"");
			Invocation.Builder iBuilder = studentRest.request(MediaType.APPLICATION_JSON);
			
			
            JSONObject jo;	
			Response odg = iBuilder.get();
				jo = new JSONObject(odg.readEntity(String.class)); 
				String soba=jo.get("IdProstora").toString();
				//System.out.println(jo.toString());
				//System.out.println(soba);
				
				
				try {
					URL url = new URL("http://soa.informatika.uni-mb.si/P9_CistilniServis/v1rest/Service1.svc/Narocila/PotrdiOpravljenoNarocilo");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setDoOutput(true);
					conn.setRequestMethod("POST");
					conn.setRequestProperty("Content-Type", "application/json");

					
					//byte[] out = "{\"Datum\":\"\\/Date(2515159062000+0100)\\/\",\"Id\":4,\"IdProstora\":42,\"Opis\":\"Po tepihu je polito rde�e vino!\",\"Opravljeno\":true,\"Preklicano\":false}" .getBytes(StandardCharsets.UTF_8);
					byte[] out = jo.toString().getBytes(StandardCharsets.UTF_8);
					OutputStream os = conn.getOutputStream();
					os.write(out);
					os.flush();

					
					BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

					String output;
					while ((output = br.readLine()) != null) {
						System.out.println(output);
					}
					
					conn.disconnect();

				  } catch (Exception e) {
					e.printStackTrace();

				  }
				
			int st_s=Integer.parseInt(soba);
			if(st_s<11){	
				DAO d=new DAO();
				d.sobaCista(Integer.parseInt(soba));
			}
			
		} catch (Exception e) {
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
