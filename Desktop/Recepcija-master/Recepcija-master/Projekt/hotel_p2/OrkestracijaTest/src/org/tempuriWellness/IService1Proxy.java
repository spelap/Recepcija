package org.tempuriWellness;

public class IService1Proxy implements org.tempuriWellness.IService1 {
  private String _endpoint = null;
  private org.tempuriWellness.IService1 iService1 = null;
  
  public IService1Proxy() {
    _initIService1Proxy();
  }
  
  public IService1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initIService1Proxy();
  }
  
  private void _initIService1Proxy() {
    try {
      iService1 = (new org.tempuriWellness.Service1Locator()).getBasicHttpBinding_IService1();
      if (iService1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iService1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iService1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iService1 != null)
      ((javax.xml.rpc.Stub)iService1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuriWellness.IService1 getIService1() {
    if (iService1 == null)
      _initIService1Proxy();
    return iService1;
  }
  
  public void wellness_Rezerviraj(java.lang.Integer id_storitev, java.lang.String emso, java.lang.String datumUraod, java.lang.String datumUrDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    iService1.wellness_Rezerviraj(id_storitev, emso, datumUraod, datumUrDo);
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_VrniWellnessStoritve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_VrniWellnessStoritve();
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija[] wellness_VrniRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_VrniRezervacijePoEMSO(emso);
  }
  
  public java.lang.Boolean wellness_PreklicRezervacijeByID(java.lang.Integer ID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PreklicRezervacijeByID(ID);
  }
  
  public java.lang.Double wellness_VrniCenoStoritve(java.lang.Integer idStoritve) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_VrniCenoStoritve(idStoritve);
  }
  
  public java.lang.Boolean wellness_PrekliciRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PrekliciRezervacijePoEMSO(emso);
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Storitev wellness_VrniStoritevByID(java.lang.Integer id) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_VrniStoritevByID(id);
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_PrikaziRazpolozljiveStoritve(java.lang.String datumuraOd, java.lang.String datumuraDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PrikaziRazpolozljiveStoritve(datumuraOd, datumuraDo);
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Prostor[] wellness_VrniVseProstore() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_VrniVseProstore();
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija wellness_SpremeniStatusRezervaciji(java.lang.Integer id, java.lang.String status) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_SpremeniStatusRezervaciji(id, status);
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.NarocilaCiscenj[] wellness_VrniNarocenaCiscenja() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_VrniNarocenaCiscenja();
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_NarociCiscenje(java.lang.Integer idProstora, java.lang.String opis, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_NarociCiscenje(idProstora, opis, datumCas);
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_PreklicCiscenja(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PreklicCiscenja(idNarocila);
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_PrestaviCiscenje(java.lang.Integer idNarocila, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PrestaviCiscenje(idNarocila, datumCas);
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_PotrdiOpravljenoCiscenje(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PotrdiOpravljenoCiscenje(idNarocila);
  }
  
  
}