package zagonski;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.datacontract.schemas._2004._07.P8_StoritvePrevozov.NarocenPrevoz;
import org.datacontract.schemas._2004._07.wellness_storitve.Storitev;
import org.tempuriPrevozi.IStoritvePrevozovService;
import org.tempuriPrevozi.StoritvePrevozovServiceLocator;
import org.tempuriWellness.Service1Locator;

import data.Gost;
import data.Oseba;
import message.Recv;
import service.Recepcija;
import si.hotelskapralnica.ws.HotelskaPralnicaServiceLocator;
import si.hotelskapralnica.ws.HotelskaPralnicaWSW;
import si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje;
import si.soa.service.AnimacijskiDogodek;
import si.soa.service.AnimacijskiDogodekService;
import si.soa.service.AnimacijskiDogodekServiceLocator;
import si.soa.service.Dogodek;


public class Zagonski {
	static Service1Locator w;
	static org.tempuriCistilnica.Service1Locator c;
	public static void main(String [] args){
		try {
			Recepcija r=new Recepcija();
			HotelskaPralnicaServiceLocator hp=new HotelskaPralnicaServiceLocator();
			HotelskaPralnicaWSW hotelska_pralnica=hp.getHotelskaPralnicaPort();
			StoritvePrevozovServiceLocator prevozi=new StoritvePrevozovServiceLocator();
			IStoritvePrevozovService pre= prevozi.getBasicHttpBinding_IStoritvePrevozovService();
			AnimacijskiDogodekServiceLocator a=new AnimacijskiDogodekServiceLocator();
			AnimacijskiDogodek ad=a.getAnimacijskiDogodekPort();
			w=new Service1Locator();
			org.tempuriWellness.IService1 wellness=w.getBasicHttpBinding_IService1();
			c=new org.tempuriCistilnica.Service1Locator();
			org.tempuriCistilnica.IService1 cistilnica=c.getBasicHttpBinding_IService1();
			String emso="333333333333";
			String storitev="1";
			
			Oseba o=new Oseba();
			o.setIme("Mali");
			o.setPriimek("Princ");
			o.setDatum_rojstva("01.05.1996");
			o.setDavcna_st(44445678);
			o.setEmso("100111111111");
			o.setStarost(22);
			o.setDan_prihoda("21.01.2018");
			o.setDan_odhoda("30.01.2018");
			o.setKosilo(true);
			o.setVecerja(true);
			o.setZajtrk(true);
			o.setWellness(true);
			o.setKakovost("Prvi");
			o.setKupon("");
			ArrayList<Oseba> osebe=new ArrayList<Oseba>();
			osebe.add(o);
			
		
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Dobrodo�li na recepciji Hotela!");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("Katero storitev �elite izbrati?");
			System.out.println("0-Prijavi se (z rezervacijo)");
			System.out.println("1-Prijavi se");
			System.out.println("2-Odjavi se");
			System.out.println("3-Preveri moj paket");
			System.out.println("4-Sporoci stevilo prostih sob");
			System.out.println("5-Izpi�i vse wellness storitve");
			System.out.println("6-Rezerviraj wellness storitev");
			System.out.println("7-Naroci ciscenje v hotelski pralnici");
			System.out.println("8-Izpisi vse animacijske dogodke");
			System.out.println("9-Prijavi se na animacijski dogodek");
			System.out.println("10-Naroci prevoz");
			System.out.println("11-Preveri sporocila");
			System.out.println("12-Preveri emso");
			System.out.println("13-Preveri rezervacijsko st.");
			System.out.println("14-Izpisi vse goste");
			
		
	       String s = br.readLine();
	        switch (s) {
	        case "0":	System.out.println("Vnesi rezervacijsko �tevilko");
	        			String stevilka=br.readLine();
	        			System.out.println(r.dodeliSobo(osebe, Integer.parseInt(stevilka))); 
         				break;
            case "1":	System.out.println(r.dodeliSobo(osebe, 0)); 
                     	break;
            case "2":  System.out.println("Vnesi �tevilko sobe");
						String stevilka_sobe=br.readLine();
            			System.out.println(r.odjaviSobo(Integer.parseInt(stevilka_sobe))); 
                     	break;
            case "3": 	System.out.println("Vnesi EM�O");
						emso=br.readLine();
            			System.out.println(r.preveriPaket(emso)); 
            			break;
            case "4":  System.out.println(r.sporociSteviloProstihSob());
                     	break;
            case "5":  Storitev[] storitve=wellness.wellness_VrniWellnessStoritve();		
						for(int i=0; i<storitve.length; i++){
							System.out.println("Storitve in cena Wellnessa: "+storitve[i].getID()+", "+storitve[i].getNazivStoritve()+", "+storitve[i].getCena()+"�");
						}
						break;
            case "6":   System.out.println("Vnesi EM�O");
						emso=br.readLine();
						System.out.println("Vnesi stevilko storitve");
						storitev=br.readLine();
            			wellness.wellness_Rezerviraj(Integer.parseInt(storitev), emso, "28/2/2018", "29/2/2018");
            			System.out.println("Storitev je bila rezevirana.");
            			break;
            case "7":  	System.out.println("Vnesi EM�O");
						emso=br.readLine();
            			Pranje p=hotelska_pralnica.narociCiscenje(emso, "1516730400000"); 
            			r.dodajNaRacun(new BigDecimal(30), emso, "�i��enje" , "23.01.2018", "ciscenje");
			            Calendar calendar = Calendar.getInstance();
			            calendar.setTimeInMillis(Long.parseLong(p.getKonecPranja()));
            			System.out.println("Konec �i��enja: "+calendar.getTime()); 
			            break;
            case "8":  	System.out.println("Kak�no vrsto dogodak i��ete?");
						String dogodek=br.readLine();
            			Dogodek[] dogodki=ad.najdiDogodke(dogodek);
            			for(int i=0; i<dogodki.length; i++){
            				System.out.println("ID dogodka: "+dogodki[i].getIdDogodka()+", Naziv: "+dogodki[i].getNaziv()+", Cena (Odrasli): "+dogodki[i].getCenaOdrasli()+"�"+", Cena (Otroci): "+dogodki[i].getCenaOtroci()+", Lokacija: "+dogodki[i].getLokacija());
            			}
						break;
            case "9":  System.out.println("Vnesi EM�O");
						emso=br.readLine();
						System.out.println("Vnesi stevilko storitve");
						storitev=br.readLine();
            			System.out.println(ad.prijavaNaDogodek(emso, Integer.parseInt(storitev), 1, 0)); //STORITVE ANIMACIJSKIH DOGODKOV
            			System.out.println("Dogodek je bil rezeviran.");
            			break;
            case "10":  System.out.println("Vnesi EM�O");
						emso=br.readLine();
						System.out.println("Vnesi �eleno lokacijo");
						storitev=br.readLine();
            			NarocenPrevoz np=new NarocenPrevoz();
	        			np.setEMSOgosta(emso);
	        			np.setKoncnaLokacija(storitev);
	        			np.setSteviloLjudi(1);
	        			GregorianCalendar c = new GregorianCalendar();
	        			np.setDatumOd(c);
	        			np.setDatumDo(c);
	        			np.setZacetnaLokacija("Hotel");
	        			System.out.println("Stevilka vasega prevoza: "+pre.narociPrevoz(np, "Kombi"));
	        			break;
            case "11":  Recv rec=new Recv(); 
            			rec.pridobi_sporocilo_odpoved(); 
						break;
            case "12":  Recv rec1=new Recv(); 
						rec1.pridobi_sporocilo_emso(); 
						break;
            case "13":  Recv rec2=new Recv(); 
						rec2.pridobi_sporocilo_rezervacijska(); 
						break;
            case "14":  ArrayList<Gost> gosti=r.vrniVseGoste();
            			for (Gost g: gosti){
    					System.out.println(g.getIme()+", "+g.getPriimek()+", "+g.getEmso());
    					}
						break;
            default: System.out.println("Napacen izbor.");
                     break;
        	}
	        

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
