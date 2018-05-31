package service;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import data.Gost;
import data.Oseba;
import data.Soba;

@WebService(name="RecepcijaWS")
public interface IRecepcija {

	@WebMethod
	public String dodajNaRacun(BigDecimal znesek, String emso, String storitev, String datum, String sifra);

	@WebMethod
	public String dodeliSobo(ArrayList<Oseba> osebe, int rezervacijska_stevilka);

	@WebMethod
	public String odjaviSobo(int st_sobe);

	@WebMethod
	public String preveriRazpolozljivostSobe(int st_sobe);

	@WebMethod
	public int sporociSteviloProstihSob();

	@WebMethod
	public boolean aliJeGost(String emso);

	@WebMethod
	public ArrayList<Gost> vrniVseGoste();

	@WebMethod
	public String preveriPaket(String emso);
	
	@WebMethod
	public String SporociOpravljenoNarocilo(int idNarocila);
	
	@WebMethod
	public ArrayList<Soba> vrniVseSobe();
	
	@WebMethod
	public String vrniNapako();
}