package org.tempuriCistilnica;

public class IService1Proxy implements org.tempuriCistilnica.IService1 {
  private String _endpoint = null;
  private org.tempuriCistilnica.IService1 iService1 = null;
  
  public IService1Proxy() {
    _initIService1Proxy();
  }
  
  public IService1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initIService1Proxy();
  }
  
  private void _initIService1Proxy() {
    try {
      iService1 = (new org.tempuriCistilnica.Service1Locator()).getBasicHttpBinding_IService1();
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
  
  public org.tempuriCistilnica.IService1 getIService1() {
    if (iService1 == null)
      _initIService1Proxy();
    return iService1;
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo narociCiscenje(java.lang.Integer idProstora, java.lang.String opis, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.System_ServiceModel.FaultException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.narociCiscenje(idProstora, opis, datumCas);
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo prekliciCiscenje(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.System_ServiceModel.FaultException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.prekliciCiscenje(idNarocila);
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo prestaviCiscenje(java.lang.Integer idNarocila, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.System_ServiceModel.FaultException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.prestaviCiscenje(idNarocila, datumCas);
  }
  
  public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo potrdiOpravljenoNarocilo(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.System_ServiceModel.FaultException{
    if (iService1 == null)
      _initIService1Proxy();
    return iService1.potrdiOpravljenoNarocilo(idNarocila);
  }
  
  
}