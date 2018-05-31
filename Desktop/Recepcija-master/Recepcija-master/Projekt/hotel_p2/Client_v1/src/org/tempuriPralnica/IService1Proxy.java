package org.tempuriPralnica;

public class IService1Proxy implements org.tempuriPralnica.IService1 {
  private String _endpoint = null;
  private org.tempuriPralnica.IService1 iService1 = null;
  
  public IService1Proxy() {
    _initIService1Proxy();
  }
  
  public IService1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initIService1Proxy();
  }
  
  private void _initIService1Proxy() {
    try {
      iService1 = (new org.tempuriPralnica.Service1Locator()).getBasicHttpBinding_IService1();
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
  
  public org.tempuriPralnica.IService1 getIService1() {
    if (iService1 == null)
      _initIService1Proxy();
    return iService1;
  }
  
  public void wellness_Rezerviraj(java.lang.Integer id_storitev, java.lang.String emso, java.util.Calendar datumUraod, java.util.Calendar datumUrDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    iService1.wellness_Rezerviraj(id_storitev, emso, datumUraod, datumUrDo);
  }
  
  public java.lang.Boolean wellness_PreveriRazpolozljivost(org.datacontract.schemas._2004._07.wellness_storitve.Storitev s, java.util.Calendar datumura) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PreveriRazpolozljivost(s, datumura);
  }
  
  public void wellness_PreklicRezervacije(org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija r) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    iService1.wellness_PreklicRezervacije(r);
  }
  
  public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_PrikaziRazpolozljiveStoritve(java.util.Calendar datumuraOd, java.util.Calendar datumuraDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.wellness_PrikaziRazpolozljiveStoritve(datumuraOd, datumuraDo);
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
  
  
}