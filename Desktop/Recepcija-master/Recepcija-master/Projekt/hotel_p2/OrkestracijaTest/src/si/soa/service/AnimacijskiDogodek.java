/**
 * AnimacijskiDogodek.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.soa.service;

public interface AnimacijskiDogodek extends java.rmi.Remote {
    public double izracunajCeno(int arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public si.soa.service.Dogodek[] najdiDogodke(java.lang.String iskalniNiz) throws java.rmi.RemoteException;
    public double odpovedPrijave(java.lang.String emso, int idDogodka, int steviloOdpovedanihOdraslih, int steviloOdpoveadnihOtrok) throws java.rmi.RemoteException;
    public double prijavaNaDogodek(java.lang.String emso, int idDogodka, int steviloOdraslih, int steviloOtrok) throws java.rmi.RemoteException;
    public void spremeniDogodek(int id, java.lang.String naziv, java.lang.String tip, java.lang.String lokacija, java.util.Calendar zacetek, java.util.Calendar konec, int st_prostih_mest, double cena_otroci, double cena_odrasli, boolean dogodekIzvenHotela, java.util.Calendar zadnji_rok_za_projavo, boolean odpovedano, boolean wellnessDogodek) throws java.rmi.RemoteException;
    public void odpovedDogodka(int idDogodka) throws java.rmi.RemoteException;
    public void ustvariNovDogodek(java.lang.String naziv, java.lang.String tip, java.lang.String lokacija, java.util.Calendar zacetek, java.util.Calendar konec, int st_prostih_mest, double cena_otroci, double cena_odrasli, boolean dogodekIzvenHotela, java.util.Calendar zadnji_rok_za_projavo, boolean wellnessDogodek) throws java.rmi.RemoteException;
    public si.soa.service.Dogodek podrobnostiDogodka(int id_dogodka) throws java.rmi.RemoteException;
}
