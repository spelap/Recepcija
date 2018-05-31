/**
 * IStoritvePrevozovService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriPrevozi;

public interface IStoritvePrevozovService extends java.rmi.Remote {
    public java.lang.Integer narociPrevoz(org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.NarocenPrevoz narocenPrevoz, java.lang.String tipVozila) throws java.rmi.RemoteException;
    public java.lang.Boolean preveriProstTermin(java.util.Calendar odhod, java.util.Calendar prihod) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.Vozilo[] pridobiSeznamVozil() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.Vozilo[] pridobiSeznamProstihVozil(java.util.Calendar odhod, java.util.Calendar prihod) throws java.rmi.RemoteException;
    public void odpovejNarocenPrevoz(org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.NarocenPrevoz narocenPrevoz) throws java.rmi.RemoteException;
    public void oddajOcenoPrevoza(org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.IzvedenPrevoz izvedenPrevoz) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.NarocenPrevoz[] pridobiNarocilaGosta(java.lang.String EMSOgosta) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.P8_StoritvePrevozovP.NarocenPrevoz[] pridobiVsaNarocila() throws java.rmi.RemoteException;
}
