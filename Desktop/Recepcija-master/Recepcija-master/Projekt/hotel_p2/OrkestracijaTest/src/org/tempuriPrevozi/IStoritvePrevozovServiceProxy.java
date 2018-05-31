package org.tempuriPrevozi;

public class IStoritvePrevozovServiceProxy implements org.tempuriPrevozi.IStoritvePrevozovService {
  private String _endpoint = null;
  private org.tempuriPrevozi.IStoritvePrevozovService iStoritvePrevozovService = null;
  
  public IStoritvePrevozovServiceProxy() {
    _initIStoritvePrevozovServiceProxy();
  }
  
  public IStoritvePrevozovServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIStoritvePrevozovServiceProxy();
  }
  
  private void _initIStoritvePrevozovServiceProxy() {
    try {
      iStoritvePrevozovService = (new org.tempuriPrevozi.StoritvePrevozovServiceLocator()).getBasicHttpBinding_IStoritvePrevozovService();
      if (iStoritvePrevozovService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iStoritvePrevozovService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iStoritvePrevozovService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iStoritvePrevozovService != null)
      ((javax.xml.rpc.Stub)iStoritvePrevozovService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuriPrevozi.IStoritvePrevozovService getIStoritvePrevozovService() {
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService;
  }
  
  public java.lang.Integer narociPrevoz(org.datacontract.schemas._2004._07.P8_StoritvePrevozov.NarocenPrevoz narocenPrevoz, java.lang.String tipVozila) throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService.narociPrevoz(narocenPrevoz, tipVozila);
  }
  
  public java.lang.Boolean preveriProstTermin(java.util.Calendar odhod, java.util.Calendar prihod) throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService.preveriProstTermin(odhod, prihod);
  }
  
  public org.datacontract.schemas._2004._07.P8_StoritvePrevozov.Vozilo[] pridobiSeznamVozil() throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService.pridobiSeznamVozil();
  }
  
  public org.datacontract.schemas._2004._07.P8_StoritvePrevozov.Vozilo[] pridobiSeznamProstihVozil(java.util.Calendar odhod, java.util.Calendar prihod) throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService.pridobiSeznamProstihVozil(odhod, prihod);
  }
  
  public void odpovejNarocenPrevoz(org.datacontract.schemas._2004._07.P8_StoritvePrevozov.NarocenPrevoz narocenPrevoz) throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    iStoritvePrevozovService.odpovejNarocenPrevoz(narocenPrevoz);
  }
  
  public void oddajOcenoPrevoza(org.datacontract.schemas._2004._07.P8_StoritvePrevozov.IzvedenPrevoz izvedenPrevoz) throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    iStoritvePrevozovService.oddajOcenoPrevoza(izvedenPrevoz);
  }
  
  public org.datacontract.schemas._2004._07.P8_StoritvePrevozov.NarocenPrevoz[] pridobiNarocilaGosta(java.lang.String EMSOgosta) throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService.pridobiNarocilaGosta(EMSOgosta);
  }
  
  public org.datacontract.schemas._2004._07.P8_StoritvePrevozov.NarocenPrevoz[] pridobiVsaNarocila() throws java.rmi.RemoteException{
    if (iStoritvePrevozovService == null)
      _initIStoritvePrevozovServiceProxy();
    return iStoritvePrevozovService.pridobiVsaNarocila();
  }
  
  
}