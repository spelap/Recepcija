package data;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;

public class Racun {
	private int st_racuna;
	private ArrayList<Storitev> storitve=new ArrayList<Storitev>();
	private String datum_odprtja;
	private String datum_poravnave;
	private BigDecimal znesek;
	
	public int getSt_racuna() {
		return st_racuna;
	}
	public void setSt_racuna(int st_racuna) {
		this.st_racuna = st_racuna;
	}
	public String getDatum_odprtja() {
		return datum_odprtja;
	}
	public void setDatum_odprtja(String datum_odprtja) {
		this.datum_odprtja = datum_odprtja;
	}
	public String getDatum_poravnave() {
		return datum_poravnave;
	}
	public void setDatum_poravnave(String datum_poravnave) {
		this.datum_poravnave = datum_poravnave;
	}
	public BigDecimal getZnesek() {
		return znesek;
	}
	public void setZnesek(BigDecimal znesek) {
		this.znesek = znesek;
	}
	public ArrayList<Storitev> getStoritve() {
		return storitve;
	}
	public void setStoritve(ArrayList<Storitev> storitve) {
		this.storitve = storitve;
	}
	
	
	
}
