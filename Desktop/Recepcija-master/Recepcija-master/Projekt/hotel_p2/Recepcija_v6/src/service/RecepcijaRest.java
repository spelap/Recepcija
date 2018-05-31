package service;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import data.DAO;
import data.Gost;
import data.Oseba;
import data.Racun;
import data.Soba;
import data.Storitev;

@Path("/Recepcija")
public class RecepcijaRest implements IRecepcija  {

	@Context
	private UriInfo uriInfo;
	@Context
	Request req;
	
	public void setUriInfo(UriInfo urInfo) { 
		this.uriInfo = urInfo; 
		} 
	public void setRequest(Request r) { 
		this.req = r; 
		}
	
	@GET
	@Path("/sayHello")
	public String sayHello() {
		return "<h1>Hello World</h1>";
	}
	
	
	@GET 
	@Path("/gost")
	@Produces(MediaType.APPLICATION_JSON) 
	@Override
	public ArrayList<Gost> vrniVseGoste() {
		DAO d=new DAO();
		ArrayList<Gost> gosti=d.vrniVseTrenutneGoste();
		return gosti; 
	}
	@GET
	@Path("/gost/{emso}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public boolean aliJeGost(@PathParam("emso") String emso){
		DAO d=new DAO();
		Gost g=d.vrniGosta(emso);
		if(g==null){
			return false;
		}else{
			return true;
		}
	}
	
	@GET
	@Path("/preveriPaket/{emso}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String preveriPaket(@PathParam("emso") String emso) {
		DAO d=new DAO();
		Gost g=d.vrniGosta(emso);
		if(g.isWellness()){
			return "Polni";
		}else{
			return "Osnovni";
		}
	}
	@GET
	@Path("/sporociOpraviljenoNarocilo/{idNarocila}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String SporociOpravljenoNarocilo(@PathParam("idNarocila") int idNarocila) {
		return "Narocilo "+ idNarocila+" je bilo opravljeno.";
	}
	@GET 
	@Path("preveriRazpolozljivostSobe") 
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public int sporociSteviloProstihSob(){
		DAO d=new DAO();
		ArrayList<Soba> sobe=d.vrniVseProsteSobe();
		return sobe.size();
	}
	@GET
	@Path("/preveriRazpolozljivostSobe/{st_sobe}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String preveriRazpolozljivostSobe(@PathParam("st_sobe") int st_sobe){
		DAO d=new DAO();
		if(d.zasedenostSobe(st_sobe)){
			return "Zasedena";
		}else{
			return "Prosta";
		}
	}
	@POST
	@Path("/odjaviSobo/{st_sobe}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String odjaviSobo(@PathParam("st_sobe") int st_sobe){
		String odgovor;
		try{
			DAO d=new DAO();
			d.sprostiSobo(st_sobe);
			Racun r=d.odjaviGosta(st_sobe);
			
			odgovor="Gost odjavljen. Pla�ati mora: "+r.getZnesek();
		}catch(Exception e){
			System.out.println(e.getMessage());
			odgovor=e.getMessage();
		}
		return odgovor;
	}
	
	@POST
	@Path("/dodajNaRacun/{znesek}/{emso}/{storitev}/{datum}/{sifra}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String dodajNaRacun(@PathParam("znesek") BigDecimal znesek,@PathParam("emso") String emso,@PathParam("storitev") String storitev,@PathParam("datum") String datum,@PathParam("sifra") String sifra){
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
	@Override
	@GET
	@Path("/vrniNapako")
	@Produces(MediaType.APPLICATION_JSON)
	public String vrniNapako() {
		return DAO.getError();
	}
	
	@POST
	@Path("/gost/{osebe}/{rezervacijska_stevilka}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public String dodeliSobo(ArrayList<Oseba> osebe, @PathParam("rezervacijska_stevilka") int rezervacijska_stevilka){
		/*String odgovor;
		if(rezervacijska_stevilka==0){
			
			try{
				Date today=new Date(1,12,2017);
				String danes=today.toString();
				long ltime=today.getTime()+7*24*60*60*1000;
				Date naslednjic=new Date(ltime);
				String n=naslednjic.toString();
				DAO d=new DAO();

					ArrayList<Soba> sobe=d.vrniVseProsteSobe();
					Soba soba=new Soba();
					int j=0;
					if(sobe.size()>0){
						for(int i=0; i<osebe.size(); i++){
							soba=sobe.get(j);
							int mesta=soba.getSt_postelj();
							if(mesta>0){
								mesta=mesta-1;
								Oseba o=osebe.get(i);
								Gost g=new Gost();
								g.setIme(o.getIme());
								g.setPriimek(o.getPriimek());
								g.setDatum_rojstva(o.getDatum_rojstva());
								g.setDavcna_st(o.getDavcna_st());
								g.setEmso(o.getEmso());
								g.setStarost(o.getStarost());
								g.setDan_prihoda(danes);
								g.setDan_odhoda(n);
								g.setRezevacijska_st("0");
								g.setZajtrk(true);
								g.setVecerja(true);
								g.setKosilo(true);
								g.setWellness(true);
								g.setSt_sobe(soba);
								
								Racun racun= new Racun();
								racun.setDatum_odprtja(danes);
								racun.setZnesek(new BigDecimal(0));
								
								int st_racuna=d.vnesiRacun(racun);
								racun.setSt_racuna(st_racuna);
								g.setRacun(racun);
								
								d.vnesiGosta(g);
								d.setZasedena(soba.getSt_sobe());
							}else{
								j++;
							}
						}
						
				}else{
					System.out.print("Vse sobe so zasedene!");
				}
		
				odgovor="Soba je bila dodeljena.";
			}catch(Exception e){
				System.out.println(e.getMessage());
				odgovor=e.getMessage();
			}
		}else{
			odgovor="Soba je bila dodeljena.";
			//Rezervacija vrniRezervacijo(int stRezervacije) //REZERVACIJA
		}
		
		return odgovor;*/
		return null;
	}
	@Override
	public ArrayList<Soba> vrniVseSobe() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
