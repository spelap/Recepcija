package test;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;

import data.DAO;
import data.Gost;
import data.Oseba;
import data.Soba;
import service.Recepcija;

public class Test {

	public static void main(String[] args) {

		Recepcija r=new Recepcija();
		Oseba o=new Oseba();
		o.setIme("Jo�e");
		o.setPriimek("Novak");
		o.setDatum_rojstva("01.05.1975");
		o.setDavcna_st(12345678);
		o.setEmso("111111111111");
		o.setStarost(42);
		o.setDan_prihoda("15.02.2018");
		o.setDan_odhoda("28.02.2018");
		o.setKosilo(true);
		o.setVecerja(true);
		o.setZajtrk(true);
		o.setWellness(true);
		o.setKakovost("Prvi");
		ArrayList<Oseba> osebe =new ArrayList<Oseba>();
		osebe.add(o);
		
		/*Oseba o1=new Oseba();
		o1.setIme("Mojca");
		o1.setPriimek("Pokrajculja");
		o1.setDatum_rojstva("1,12,1996");
		o1.setDavcna_st(12378978);
		o1.setEmso("222222222222");
		o1.setStarost(21);
		ArrayList<Oseba> osebe1 =new ArrayList<Oseba>();
		osebe1.add(o1);*/
		
		System.out.println(r.dodeliSobo(osebe, 1));
		//System.out.println(r.aliJeGost("111111111111"));
		//System.out.println(r.dodajNaRacun(new BigDecimal(10), "111111111111", "likanje hla�", "08.01.2018", "222"));
		//System.out.println(r.odjaviSobo(1));
		//System.out.println(r.preveriPaket("111111111111"));
		//System.out.println(r.preveriRazpolozljivostSobe(1));
		//System.out.println(r.sporociSteviloProstihSob());
		/*ArrayList<Gost> gosti=r.vrniVseGoste();
		for (Gost g: gosti){
			System.out.println("Em�o gosta: "+g.getEmso());
		}
		ArrayList<Soba> sobe=r.vrniVseSobe();
		for (Soba s: sobe){
			System.out.println("�t sobe: "+s.getSt_sobe());
		}*/

	}

}
