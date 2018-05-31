/**
 * HotelskaPralnicaWSW.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.hotelskapralnica.ws;

public interface HotelskaPralnicaWSW extends java.rmi.Remote {
    public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje narociCiscenje(java.lang.String emso, java.lang.String casPrevzema) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public void prekiniStoritev(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[] delovniCas() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public void obvestiRecepcijo(int idPranja) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje narociLikanje(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[] pridobiVsaPranja() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[] pridobiPranjaZaGosta(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public void nakupOblacila(java.lang.String emso, si.hotelskapralnica.ws.HotelskaPralnica.Oblacilo.Oblacilo oblacilo, si.hotelskapralnica.ws.HotelskaPralnica.ProdajalnaOblacil.ProdajalnaOblacil prodajalna) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public java.lang.String pralnicaProsta() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean;
    public double cenaStoritve(java.lang.String[] tipOblacila) throws java.rmi.RemoteException;
}
