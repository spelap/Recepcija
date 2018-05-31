package data;

import java.math.BigDecimal;
import java.util.Date;

public class Storitev {
	private String naziv;
	private BigDecimal znesek;
	private String datum;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public BigDecimal getZnesek() {
		return znesek;
	}
	public void setZnesek(BigDecimal znesek) {
		this.znesek = znesek;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	
	
}
