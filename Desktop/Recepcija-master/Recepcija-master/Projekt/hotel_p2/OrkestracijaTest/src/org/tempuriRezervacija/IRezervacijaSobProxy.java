package org.tempuriRezervacija;

public class IRezervacijaSobProxy implements org.tempuriRezervacija.IRezervacijaSob {
  private String _endpoint = null;
  private org.tempuriRezervacija.IRezervacijaSob iRezervacijaSob = null;
  
  public IRezervacijaSobProxy() {
    _initIRezervacijaSobProxy();
  }
  
  public IRezervacijaSobProxy(String endpoint) {
    _endpoint = endpoint;
    _initIRezervacijaSobProxy();
  }
  
  private void _initIRezervacijaSobProxy() {
    try {
      iRezervacijaSob = (new org.tempuriRezervacija.RezervacijaSobLocator()).getBasicHttpBinding_IRezervacijaSob();
      if (iRezervacijaSob != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iRezervacijaSob)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iRezervacijaSob)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iRezervacijaSob != null)
      ((javax.xml.rpc.Stub)iRezervacijaSob)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuriRezervacija.IRezervacijaSob getIRezervacijaSob() {
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob;
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija[] vrniRezervacije() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.vrniRezervacije();
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija vrniRezervacijo(java.lang.String stRezervacije) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.vrniRezervacijo(stRezervacije);
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija rezervirajSobo(java.lang.String terminOd, java.lang.String terminDo, java.lang.Integer tipSobe, java.lang.String stopnjaUdobja, java.lang.Boolean zajtrk, java.lang.Boolean kosilo, java.lang.Boolean vecerja, java.lang.Boolean wellness, org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba nosilec, java.lang.Integer steviloOtrok, java.lang.Integer steviloOdraslih, java.lang.String stevilkaKupina, java.lang.String opomba) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.rezervirajSobo(terminOd, terminDo, tipSobe, stopnjaUdobja, zajtrk, kosilo, vecerja, wellness, nosilec, steviloOtrok, steviloOdraslih, stevilkaKupina, opomba);
  }
  
  public java.lang.String prekliciRezervacijo(java.lang.String stRezervacije) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.prekliciRezervacijo(stRezervacije);
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija spremeniRezervacijo(java.lang.String stRezervacije, java.lang.String terminOd, java.lang.String terminDo, java.lang.Integer tipSobe, java.lang.String stopnjaUdobja, java.lang.Boolean zajtrk, java.lang.Boolean kosilo, java.lang.Boolean vecerja, java.lang.Boolean wellness, org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba nosilec, java.lang.Integer steviloOtrok, java.lang.Integer steviloOdraslih, java.lang.String stevilkaKupona, java.lang.String opomba) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.spremeniRezervacijo(stRezervacije, terminOd, terminDo, tipSobe, stopnjaUdobja, zajtrk, kosilo, vecerja, wellness, nosilec, steviloOtrok, steviloOdraslih, stevilkaKupona, opomba);
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba[] vrniOsebe() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.vrniOsebe();
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba vrniOsebo(java.lang.String id) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.vrniOsebo(id);
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba ustvariOsebo(java.lang.String ime, java.lang.String priimek, java.lang.String emso, java.lang.String datumRojstva, java.lang.String opomba) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.ustvariOsebo(ime, priimek, emso, datumRojstva, opomba);
  }
  
  public java.lang.String izbrisiOsebo(java.lang.String id) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.izbrisiOsebo(id);
  }
  
  public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba spremeniOsebo(java.lang.String id, java.lang.String ime, java.lang.String priimek, java.lang.String emso, java.lang.String datumRojstva, java.lang.String opomba) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.spremeniOsebo(id, ime, priimek, emso, datumRojstva, opomba);
  }
  
  public java.lang.String vrniIdNosilca(java.lang.String stRezervacije) throws java.rmi.RemoteException{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.vrniIdNosilca(stRezervacije);
  }
  
  public java.lang.Integer vrniStProstihSob(java.lang.String terminOd, java.lang.String terminDo, java.lang.Integer tipSobe) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.SystemR.Exception{
    if (iRezervacijaSob == null)
      _initIRezervacijaSobProxy();
    return iRezervacijaSob.vrniStProstihSob(terminOd, terminDo, tipSobe);
  }
  
  
}