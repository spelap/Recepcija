/**
 * RecepcijaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface RecepcijaWS extends java.rmi.Remote {
    public java.lang.String vrniNapako() throws java.rmi.RemoteException;
    public java.lang.String preveriRazpolozljivostSobe(int arg0) throws java.rmi.RemoteException;
    public int sporociSteviloProstihSob() throws java.rmi.RemoteException;
    public java.lang.String dodeliSobo(service.Oseba[] arg0, int arg1) throws java.rmi.RemoteException;
    public java.lang.String preveriPaket(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean aliJeGost(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String sporociOpravljenoNarocilo(int arg0) throws java.rmi.RemoteException;
    public java.lang.String odjaviSobo(int arg0) throws java.rmi.RemoteException;
    public java.lang.String dodajNaRacun(java.math.BigDecimal arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException;
    public service.Soba[] vrniVseSobe() throws java.rmi.RemoteException;
    public service.Gost[] vrniVseGoste() throws java.rmi.RemoteException;
}
