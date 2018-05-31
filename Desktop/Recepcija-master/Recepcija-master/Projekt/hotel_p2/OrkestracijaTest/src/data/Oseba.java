package data;

import java.sql.Date;

public class Oseba {

	private String ime;
	private String priimek;
	private int starost;
	private String datum_rojstva;
	private String emso;
	private int davcna_st;
	private String dan_prihoda;
	private String dan_odhoda;
	private boolean zajtrk;
	private boolean kosilo;
	private boolean vecerja;
	private boolean wellness;
	private String kakovost;
	private String kupon;

	public Oseba() {
		super();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPriimek() {
		return priimek;
	}

	public void setPriimek(String priimek) {
		this.priimek = priimek;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

	public String getDatum_rojstva() {
		return datum_rojstva;
	}

	public void setDatum_rojstva(String datum_rojstva) {
		this.datum_rojstva = datum_rojstva;
	}

	public String getEmso() {
		return emso;
	}

	public void setEmso(String emso) {
		this.emso = emso;
	}

	public int getDavcna_st() {
		return davcna_st;
	}

	public void setDavcna_st(int davcna_st) {
		this.davcna_st = davcna_st;
	}

	public String getDan_prihoda() {
		return dan_prihoda;
	}

	public void setDan_prihoda(String dan_prihoda) {
		this.dan_prihoda = dan_prihoda;
	}

	public String getDan_odhoda() {
		return dan_odhoda;
	}

	public void setDan_odhoda(String dan_odhoda) {
		this.dan_odhoda = dan_odhoda;
	}

	public boolean isZajtrk() {
		return zajtrk;
	}

	public void setZajtrk(boolean zajtrk) {
		this.zajtrk = zajtrk;
	}

	public boolean isKosilo() {
		return kosilo;
	}

	public void setKosilo(boolean kosilo) {
		this.kosilo = kosilo;
	}

	public boolean isVecerja() {
		return vecerja;
	}

	public void setVecerja(boolean vecerja) {
		this.vecerja = vecerja;
	}

	public boolean isWellness() {
		return wellness;
	}

	public void setWellness(boolean wellness) {
		this.wellness = wellness;
	}

	public String getKakovost() {
		return kakovost;
	}

	public void setKakovost(String kakovost) {
		this.kakovost = kakovost;
	}

	public String getKupon() {
		return kupon;
	}

	public void setKupon(String kupon) {
		this.kupon = kupon;
	}

	@Override
	public String toString() {
		return "Oseba [ime=" + ime + ", priimek=" + priimek + ", starost=" + starost + ", datum_rojstva="
				+ datum_rojstva + ", emso=" + emso + ", davcna_st=" + davcna_st + ", dan_prihoda=" + dan_prihoda
				+ ", dan_odhoda=" + dan_odhoda + ", zajtrk=" + zajtrk + ", kosilo=" + kosilo + ", vecerja=" + vecerja
				+ ", wellness=" + wellness + ", kakovost=" + kakovost + ", kupon=" + kupon + "]";
	}
	
	
}