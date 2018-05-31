package data;

import java.io.Console;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {
	public static Connection connect;
	 private Statement statement = null;
	  private PreparedStatement preparedStatement = null;
	  private ResultSet resultSet = null;
	  
	  private static String error="Ni ga";
	  
	  final private String host = "soa.informatika.uni-mb.si:3306";
	  final private String user = "hotel_p2";
	  final private String passwd = "dingDong";
	  
	public DAO(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
		      
		      // Setup the connection with the DB
		      connect = DriverManager
		          .getConnection("jdbc:mysql://" + host + "/hotel_p2?"
		              + "user=" + user + "&password=" + passwd+"&verifyServerCertificate=false&useSSL=true" );
		  
		} catch (Exception e) {
			System.out.println(e.getMessage());
			error=e.getMessage();
			e.printStackTrace();
		}
		
	}
	public void vnesiGosta(Gost gost){
	      try {
			statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("insert into  hotel_p2.gost(emso, ime, priimek, starost, datum_rojstva, davcna_st, rezervacijska_st, dan_prihoda, dan_odhoda, trenutnoGost, wellness, zajtrk, kosilo, vecerja, idRacun_fk, idSoba_fk) values (?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?)");
	   
	      preparedStatement.setString(1, gost.getEmso());
	      preparedStatement.setString(2, gost.getIme());
	      preparedStatement.setString(3, gost.getPriimek());
	      preparedStatement.setInt(4, gost.getStarost());
	      preparedStatement.setString(5, gost.getDatum_rojstva());
	      preparedStatement.setInt(6, gost.getDavcna_st());
	      preparedStatement.setString(7, gost.getRezevacijska_st());
	      preparedStatement.setString(8, gost.getDan_prihoda());
	      preparedStatement.setString(9, gost.getDan_odhoda());
	      preparedStatement.setString(10, "true");
	      preparedStatement.setString(11, Boolean.toString(gost.isWellness()));
	      preparedStatement.setString(12, Boolean.toString(gost.isZajtrk()));
	      preparedStatement.setString(13, Boolean.toString(gost.isKosilo()));
	      preparedStatement.setString(14, Boolean.toString(gost.isVecerja()));
	      preparedStatement.setInt(15, gost.getRacun().getSt_racuna());
	      preparedStatement.setInt(16, gost.getSoba().getSt_sobe());
	      preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			error=e.getMessage();
			e.printStackTrace();
		}
	}
	
	public Gost vrniGosta(String emso){
		Gost g=null;
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT emso, ime, priimek, starost, datum_rojstva, davcna_st, rezervacijska_st, dan_prihoda, dan_odhoda, wellness, zajtrk, kosilo, vecerja, trenutnoGost, idRacun_fk, idSoba_fk FROM hotel_p2.gost WHERE emso ="+emso+"");
            while (rs.next()) {
            	g=new Gost();
            	g.setIme(rs.getString("ime"));
				g.setPriimek(rs.getString("priimek"));
				g.setDatum_rojstva(rs.getString("datum_rojstva"));
				g.setDavcna_st(rs.getInt("davcna_st"));
				g.setEmso(rs.getString("emso"));
				g.setStarost(rs.getInt("starost"));
				g.setDan_prihoda(rs.getString("dan_prihoda"));
				g.setDan_odhoda(rs.getString("dan_odhoda"));
				g.setRezevacijska_st(rs.getString("rezervacijska_st"));
				g.setZajtrk(rs.getBoolean("zajtrk"));
				g.setVecerja(rs.getBoolean("vecerja"));
				g.setKosilo(rs.getBoolean("kosilo"));
				g.setWellness(rs.getBoolean("wellness"));
				g.setTrenutnoGost(rs.getBoolean("trenutnoGost"));
				
				g.setSt_sobe(vrniSobo(rs.getInt("idSoba_fk")));
				g.setRacun(vrniRacun(rs.getInt("idRacun_fk")));

            }
        } catch (Exception e) {
        	System.out.println("Napaka1:"+e.getMessage());
            System.err.println("Napaka:"+e.getMessage());
            error=e.getMessage();
        }
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
			error=e.getMessage();
			System.err.println("Napaka2:"+e.getMessage());
		}
		return g;
	}
	
	public Racun vrniGostovRacun(String emso){
		Racun r=new Racun();
		int id_racun=0;
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT idRacun_fk FROM hotel_p2.gost WHERE emso ="+emso+"");
            while (rs.next()) {
               id_racun=rs.getInt("idRacun_fk");
            }
            
            rs = statement.executeQuery("SELECT * FROM hotel_p2.racun WHERE id_racun ="+id_racun+"");
            while (rs.next()) {
                r.setZnesek(rs.getBigDecimal("znesek"));
                r.setDatum_odprtja(rs.getString("datum_odprtja"));
                r.setSt_racuna(rs.getInt("id_racun"));
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return r;
	}
	public int vnesiRacun(Racun r){
	
		try {
			statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("insert into  hotel_p2.racun(znesek, datum_odprtja) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
	   
	      preparedStatement.setBigDecimal(1, r.getZnesek());
	      preparedStatement.setString(2, r.getDatum_odprtja());
	      preparedStatement.executeUpdate();
	      ResultSet rs = preparedStatement.getGeneratedKeys();
	      int generatedKey = 0;
	      if (rs.next()) {
	          generatedKey = rs.getInt(1);
	      }
	      
	     return generatedKey;
	      
		} catch (Exception e) {
			System.out.println(e.getMessage());
			error=e.getMessage();
			e.printStackTrace();
			return 0;
		} 
		
	}
	
	public void posodobiRacun(Racun r, Storitev s){
		try {
			statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("UPDATE racun SET znesek = ? WHERE id_racun = ? ");
	     
	      preparedStatement.setBigDecimal(1, r.getZnesek());
	      preparedStatement.setInt(2, r.getSt_racuna());
	      preparedStatement.executeUpdate();

	      preparedStatement = connect
	          .prepareStatement("insert into  hotel_p2.storitev(naziv, cena, idRacun_fk) values (?, ?, ?)");
	   
	      preparedStatement.setString(1, s.getNaziv());
	      preparedStatement.setBigDecimal(2, s.getZnesek());
	      preparedStatement.setInt(3, r.getSt_racuna());
	      preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			error=e.getMessage();
			e.printStackTrace();
		} 
	}
	
	public ArrayList<Gost> vrniVseTrenutneGoste(){
		ArrayList<Gost> gostje=new ArrayList<Gost>();
		
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT emso, ime, priimek, starost, datum_rojstva, davcna_st, rezervacijska_st, dan_prihoda, dan_odhoda, wellness, zajtrk, kosilo, vecerja, idRacun_fk, idSoba_fk FROM hotel_p2.gost WHERE trenutnoGost = 'true'");
            while (rs.next()) {
            	Gost g=new Gost();
                g.setIme(rs.getString("ime"));
				g.setPriimek(rs.getString("priimek"));
				g.setDatum_rojstva(rs.getString("datum_rojstva"));
				g.setDavcna_st(rs.getInt("davcna_st"));
				g.setEmso(rs.getString("emso"));
				g.setStarost(rs.getInt("starost"));
				g.setDan_prihoda(rs.getString("dan_prihoda"));
				g.setDan_odhoda(rs.getString("dan_odhoda"));
				g.setRezevacijska_st(rs.getString("rezervacijska_st"));
				g.setZajtrk(rs.getBoolean("zajtrk"));
				g.setVecerja(rs.getBoolean("vecerja"));
				g.setKosilo(rs.getBoolean("kosilo"));
				g.setWellness(rs.getBoolean("wellness"));
				
				g.setSt_sobe(vrniSobo(rs.getInt("idSoba_fk")));
				g.setRacun(vrniRacun(rs.getInt("idRacun_fk")));
                
				gostje.add(g);
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return gostje;
	}
	
	public ArrayList<Gost> vrniGosteIzSobe(int id_soba){
		ArrayList<Gost> gostje=new ArrayList<Gost>();
		
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT emso, ime, priimek, starost, datum_rojstva, davcna_st, rezervacijska_st, dan_prihoda, dan_odhoda, wellness, zajtrk, kosilo, vecerja, idRacun_fk, idSoba_fk FROM hotel_p2.gost WHERE idSoba_fk = "+id_soba+"");
            while (rs.next()) {
            	Gost g=new Gost();
                g.setIme(rs.getString("ime"));
				g.setPriimek(rs.getString("priimek"));
				g.setDatum_rojstva(rs.getString("datum_rojstva"));
				g.setDavcna_st(rs.getInt("davcna_st"));
				g.setEmso(rs.getString("emso"));
				g.setStarost(rs.getInt("starost"));
				g.setDan_prihoda(rs.getString("dan_prihoda"));
				g.setDan_odhoda(rs.getString("dan_odhoda"));
				g.setRezevacijska_st(rs.getString("rezervacijska_st"));
				g.setZajtrk(rs.getBoolean("zajtrk"));
				g.setVecerja(rs.getBoolean("vecerja"));
				g.setKosilo(rs.getBoolean("kosilo"));
				g.setWellness(rs.getBoolean("wellness"));
				
				g.setSt_sobe(vrniSobo(rs.getInt("idSoba_fk")));
				g.setRacun(vrniRacun(rs.getInt("idRacun_fk")));
                
				gostje.add(g);
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return gostje;
	}
	
	public ArrayList<Soba> vrniVseProsteSobe(){
		ArrayList<Soba> prosteSobe=new ArrayList<Soba>();
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM hotel_p2.soba WHERE zasedena = '0'");
            while (rs.next()) {
            	Soba s= new Soba();
                s.setStanje_sobe(rs.getString("stanje_sobe"));
                s.setRang_kakovosti(rs.getString("rang_kakovosti"));
                s.setSt_postelj(rs.getInt("st_postelj"));
                s.setSt_sobe(rs.getInt("st_sobe"));
                int z=rs.getInt("zasedena");
                boolean za=true;
                if(z==0){
                	za=false;
                }
                s.setZasedena(za);
                s.setCena(rs.getDouble("cena"));
                prosteSobe.add(s);
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return prosteSobe;
	}
	
	public ArrayList<Soba> vrniVseSobe(){
		ArrayList<Soba> sobe=new ArrayList<Soba>();
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM hotel_p2.soba");
            while (rs.next()) {
            	Soba s= new Soba();
                s.setStanje_sobe(rs.getString("stanje_sobe"));
                s.setRang_kakovosti(rs.getString("rang_kakovosti"));
                s.setSt_postelj(rs.getInt("st_postelj"));
                s.setSt_sobe(rs.getInt("st_sobe"));
                int z=rs.getInt("zasedena");
                boolean za=true;
                if(z==0){
                	za=false;
                }
                s.setZasedena(za);
                s.setCena(rs.getDouble("cena"));
                sobe.add(s);
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return sobe;
	}
	
	public ArrayList<Soba> vrniVseZasedeneSobe(){
		ArrayList<Soba> zasedeneSobe=new ArrayList<Soba>();
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM hotel_p2.soba WHERE zasedena = 1");
            while (rs.next()) {
            	Soba s= new Soba();
                s.setStanje_sobe(rs.getString("stanje_sobe"));
                s.setRang_kakovosti(rs.getString("rang_kakovosti"));
                s.setSt_postelj(rs.getInt("st_postelj"));
                int z=rs.getInt("zasedena");
                boolean za=true;
                if(z==0){
                	za=false;
                }
                s.setZasedena(za);
                s.setCena(rs.getDouble("cena"));
                zasedeneSobe.add(s);
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return zasedeneSobe;
	}
	
	public void sprostiSobo(int st_sobe){
		try {
			statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("UPDATE soba SET zasedena = ? WHERE st_sobe = ? ");
	     
	      preparedStatement.setInt(1, 0);
	      preparedStatement.setInt(2, st_sobe);
	      preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			error=e.getMessage();
			e.printStackTrace();
		} 
	}
	
	public Racun odjaviGosta(int st_sobe){
		Racun r= new Racun();
		
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT emso, idRacun_fk, idSoba_fk FROM hotel_p2.gost WHERE idSoba_fk = "+st_sobe+"");
            while (rs.next()) {
            	String emso=rs.getString("emso");
				r=vrniRacun(rs.getInt("idRacun_fk"));
				/*
				preparedStatement = connect
				          .prepareStatement("UPDATE gost SET trenutnoGost = ? WHERE emso = ? ");
				     
				      preparedStatement.setString(1, "false");
				      preparedStatement.setString(2, emso);
				      preparedStatement.executeUpdate();
				 */
				preparedStatement = connect
				          .prepareStatement("DELETE FROM gost WHERE emso = ?");
				      preparedStatement.setString(1, emso);
				      preparedStatement.executeUpdate();
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            error=e.getMessage();
        }
		return r;
	}
	
	public void setZasedena(int st_sobe){
		try {
			statement = connect.createStatement();

	      preparedStatement = connect
	          .prepareStatement("UPDATE soba SET zasedena = ? WHERE st_sobe = ? ");
	     
	      preparedStatement.setInt(1, 1);
	      preparedStatement.setInt(2, st_sobe);
	      preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			error=e.getMessage();
			e.printStackTrace();
		} 
		
	}
	
	public boolean zasedenostSobe(int st_sobe){
		boolean za=true;
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT zasedena FROM hotel_p2.soba WHERE st_sobe ="+st_sobe+"");
            while (rs.next()) {
     
                int z=rs.getInt("zasedena");
                if(z==0){
                	za=false;
                }
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		
		return za;
	}
	
	public Soba vrniSobo(int idSoba){
		Soba s= new Soba();
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM hotel_p2.soba WHERE st_sobe ="+idSoba+"");
            while (rs.next()) {
                s.setStanje_sobe(rs.getString("stanje_sobe"));
                s.setRang_kakovosti(rs.getString("rang_kakovosti"));
                s.setSt_postelj(rs.getInt("st_postelj"));
                int z=rs.getInt("zasedena");
                boolean za=true;
                if(z==0){
                	za=false;
                }
                s.setZasedena(za);
                s.setCena(rs.getDouble("cena"));
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		
		return s;
	}
	
	public Racun vrniRacun(int idRacun){
		Racun r=new Racun();
		try {
			statement = connect.createStatement();
            ResultSet rs;
 
            rs = statement.executeQuery("SELECT * FROM hotel_p2.racun WHERE id_racun ="+idRacun+"");
            while (rs.next()) {
                r.setZnesek(rs.getBigDecimal("znesek"));
                r.setDatum_odprtja(rs.getString("datum_odprtja"));
                r.setSt_racuna(rs.getInt("id_racun"));
            }
            //connect.close();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
            System.err.println(e.getMessage());
            error=e.getMessage();
        }
		return r;
	}
	public static String getError() {
		return error;
	}
	public static void setError(String error) {
		DAO.error = error;
	}
	
	
}
