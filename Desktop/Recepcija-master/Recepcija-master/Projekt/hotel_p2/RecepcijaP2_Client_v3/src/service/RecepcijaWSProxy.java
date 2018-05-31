package service;

public class RecepcijaWSProxy implements service.RecepcijaWS {
  private String _endpoint = null;
  private service.RecepcijaWS recepcijaWS = null;
  
  public RecepcijaWSProxy() {
    _initRecepcijaWSProxy();
  }
  
  public RecepcijaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initRecepcijaWSProxy();
  }
  
  private void _initRecepcijaWSProxy() {
    try {
      recepcijaWS = (new service.RecepcijaServiceLocator()).getRecepcijaPort();
      if (recepcijaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)recepcijaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)recepcijaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (recepcijaWS != null)
      ((javax.xml.rpc.Stub)recepcijaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.RecepcijaWS getRecepcijaWS() {
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS;
  }
  
  public java.lang.String vrniNapako() throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.vrniNapako();
  }
  
  public java.lang.String preveriRazpolozljivostSobe(int arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.preveriRazpolozljivostSobe(arg0);
  }
  
  public int sporociSteviloProstihSob() throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.sporociSteviloProstihSob();
  }
  
  public java.lang.String dodeliSobo(service.Oseba[] arg0, int arg1) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.dodeliSobo(arg0, arg1);
  }
  
  public java.lang.String preveriPaket(java.lang.String arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.preveriPaket(arg0);
  }
  
  public boolean aliJeGost(java.lang.String arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.aliJeGost(arg0);
  }
  
  public java.lang.String sporociOpravljenoNarocilo(int arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.sporociOpravljenoNarocilo(arg0);
  }
  
  public java.lang.String odjaviSobo(int arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.odjaviSobo(arg0);
  }
  
  public java.lang.String dodajNaRacun(java.math.BigDecimal arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.dodajNaRacun(arg0, arg1, arg2, arg3, arg4);
  }
  
  public service.Soba[] vrniVseSobe() throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.vrniVseSobe();
  }
  
  public service.Gost[] vrniVseGoste() throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.vrniVseGoste();
  }
  
  
}