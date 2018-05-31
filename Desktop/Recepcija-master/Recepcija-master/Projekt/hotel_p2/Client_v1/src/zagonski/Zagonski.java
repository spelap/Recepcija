package zagonski;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo;
import org.datacontract.schemas._2004._07.wellness_storitve.Storitev;
import org.tempuriPralnica.IService1;
import org.tempuriPralnica.IService1Proxy;

import service.Gost;
import service.Oseba;
import service.RecepcijaService;
import service.RecepcijaWS;
import si.hotelskapralnica.ws.HotelskaPralnicaService;
import si.hotelskapralnica.ws.HotelskaPralnicaServiceLocator;
import si.hotelskapralnica.ws.HotelskaPralnicaWSW;
import si.hotelskapralnica.ws.HotelskaPralnicaWSWProxy;
import si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje;

public class Zagonski {
	static HotelskaPralnicaWSW hp;
	static IService1 w;
	static org.tempuriCistilnica.IService1 c;
	public static void main(String [] args){
		RecepcijaService rs=new RecepcijaService();
		hp=new HotelskaPralnicaWSWProxy();
		w=new IService1Proxy();
		c=new org.tempuriCistilnica.IService1Proxy();
		try {
			
			RecepcijaWS r=rs.getRecepcijaPort();
			Oseba o=new Oseba();
			o.setIme("Jože");
			o.setPriimek("Novak");
			o.setDatumRojstva("01.05.1975");
			o.setDavcnaSt(44445678);
			o.setEmso("888888888888");
			o.setStarost(42);
			o.setDanPrihoda("15.02.2018");
			o.setDanOdhoda("28.02.2018");
			o.setKosilo(true);
			o.setVecerja(true);
			o.setZajtrk(true);
			o.setWellness(true);
			o.setKakovost("Prvi");
			ArrayList<Oseba> osebe =new ArrayList<Oseba>();
			osebe.add(o);
			
			Calendar cal = Calendar.getInstance();
			cal.set(2018, 17, 12, 19, 19);
			Calendar cal1 = Calendar.getInstance();
			cal1.set(2018, 17, 12, 20, 20);

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Dobrodošli na recepciji Hotela!");
			System.out.println("--------------------------------------------------------------------------------------------------------");
			System.out.println("Katero storitev želite izbrati?");
			System.out.println("1-Prijavi se");
			System.out.println("2-Odjavi se");
			System.out.println("3-Preveri moj paket");
			System.out.println("4-Sporoci stevilo prostih sob");
			System.out.println("5-Izpiši vse wellness storitve");
			System.out.println("6-Rezerviraj wellness storitev");
			System.out.println("7-Naroci ciscenje v hotelski pralnici");
			System.out.println("8-Izpisi vse animacijske dogodke");
			System.out.println("9-Prijavi se na animacijski dogodek");
			
		
	        String s = br.readLine();
	        switch (s) {
            case "1":  System.out.println(r.dodeliSobo(osebe, 0)); //VNESI OSEBO
                     	break;
            case "2":  System.out.println(r.odjaviSobo(4)); //VNESI ŠT SOBE
                     	break;
            case "3": System.out.println(r.preveriPaket("888888888888")); //VNESI EMŠO OSEBE
            			break;
            case "4":  System.out.println(r.sporociSteviloProstihSob());
                     	break;
            case "5":  Storitev[] storitve=w.wellness_VrniWellnessStoritve();		//WELLNESS STORITVE - WSDL jim ne deluje
						for(int i=0; i<storitve.length; i++){
							System.out.println("ID storitve in cena: "+storitve[i].getID()+", "+storitve[i].getCena()+"€");
						}
						break;
            case "6":   w.wellness_Rezerviraj(1, "888888888888", cal, cal1);
            			break;
            case "7":  Pranje p=hp.narociCiscenje("888888888888", "1533074400000");
            			System.out.println("Konec èišèenja: "+p.getKonecPranja()); //STORITVE HOTELSKE PRALNICE
						break;
            case "8":  System.out.println("WSDL ni objavljen!!!"); //STORITVE ANIMACIJSKIH DOGODKOV
						break;
            case "9":  System.out.println("WSDL ni objavljen!!!"); //STORITVE ANIMACIJSKIH DOGODKOV
						break;
            default: System.out.println("Napacen izbor.");
                     break;
        	}
        	
			
			/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Dobrodošli na recepciji Hotela!");
			System.out.println("Katero storitev želite izbrati?");
			System.out.println("1-Prijavi se");
			System.out.println("2-Preveri èe je gost");
			System.out.println("3-Dodaj na gostov raèun");
			System.out.println("4-Odjavi gosta");
			System.out.println("5-Preveri gostov paket");
			System.out.println("6-Preveri razpolozljivost sobe");
			System.out.println("7-Sporoci stevilo prostih sob");
			System.out.println("8-Prikazi vse goste");
			System.out.println("9-Izpiši vse wellness storitve");
			System.out.println("10-Rezerviraj wellness storitev");
			System.out.println("11-Naroci ciscenje v hotelski pralnici");
			System.out.println("12-Preklici ciscenje sobe");
			
		
	        String s = br.readLine();
	        switch (s) {
            case "1":  System.out.println(r.dodeliSobo(osebe, 0));
                     break;
            case "2":  System.out.println(r.aliJeGost("111111111111"));
                     break;
            case "3":  System.out.println(r.dodajNaRacun(new BigDecimal(20), "333333333333", "Tenis", "19.12.2017", "222"));
                     break;
            case "4":  System.out.println(r.odjaviSobo(1));
                     break;
            case "5": System.out.println(r.preveriPaket("111111111111"));
                     break;
            case "6": System.out.println(r.preveriRazpolozljivostSobe(1));
            			break;
            case "7":  System.out.println(r.sporociSteviloProstihSob());
                     break;
            case "8":  List<Gost> gosti=r.vrniVseGoste();
						for(int i=0; i<gosti.size(); i++){
								System.out.println("EMSO gosta: "+gosti.get(i).getEmso());
						}
                     break;
            case "9":  Storitev[] storitve=w.wellness_VrniWellnessStoritve();		//WELLNESS STORITVE
						for(int i=0; i<storitve.length; i++){
							System.out.println("Id storitve: "+storitve[i].getID());
						}
						break;
            case "10":  w.wellness_Rezerviraj(1, "111111111111", cal, cal1);
            			break;
            case "11":  Pranje p=hp.narociCiscenje("111111111111", "1533074400000");
            			System.out.println("Konec èišèenja: "+p.getKonecPranja()); //STORITVE HOTELSKE PRALNICE
						break;
            case "12":  Narocilo n=c.prekliciCiscenje(1);
						break;
            default: List<Gost> gosti1=r.vrniVseGoste();
					for(int i=0; i<gosti1.size(); i++){
							System.out.println("EMSO gosta: "+gosti1.get(i).getEmso());
					}
                     break;
        	}
        	*/
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
