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
  
  public java.lang.String dodajNaRacun(double arg0, service.Gost arg1, java.lang.String arg2, java.util.Calendar arg3, java.lang.String arg4) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.dodajNaRacun(arg0, arg1, arg2, arg3, arg4);
  }
  
  public java.lang.String preveriRazpolozljivostSobe(int arg0, java.util.Calendar arg1, java.util.Calendar arg2) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.preveriRazpolozljivostSobe(arg0, arg1, arg2);
  }
  
  public int sporociSteviloProstihSob() throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.sporociSteviloProstihSob();
  }
  
  public service.Gost[] vrniVseGoste() throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.vrniVseGoste();
  }
  
  public boolean aliJeGost(service.Oseba arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.aliJeGost(arg0);
  }
  
  public java.lang.String odjaviSobo(int arg0) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.odjaviSobo(arg0);
  }
  
  public java.lang.String dodeliSobo(service.Oseba[] arg0, int arg1) throws java.rmi.RemoteException{
    if (recepcijaWS == null)
      _initRecepcijaWSProxy();
    return recepcijaWS.dodeliSobo(arg0, arg1);
  }
  
  
}