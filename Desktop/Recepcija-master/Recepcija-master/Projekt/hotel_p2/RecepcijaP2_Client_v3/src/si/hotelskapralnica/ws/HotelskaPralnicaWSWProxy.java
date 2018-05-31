package si.hotelskapralnica.ws;

public class HotelskaPralnicaWSWProxy implements si.hotelskapralnica.ws.HotelskaPralnicaWSW {
  private String _endpoint = null;
  private si.hotelskapralnica.ws.HotelskaPralnicaWSW hotelskaPralnicaWSW = null;
  
  public HotelskaPralnicaWSWProxy() {
    _initHotelskaPralnicaWSWProxy();
  }
  
  public HotelskaPralnicaWSWProxy(String endpoint) {
    _endpoint = endpoint;
    _initHotelskaPralnicaWSWProxy();
  }
  
  private void _initHotelskaPralnicaWSWProxy() {
    try {
      hotelskaPralnicaWSW = (new si.hotelskapralnica.ws.HotelskaPralnicaServiceLocator()).getHotelskaPralnicaPort();
      if (hotelskaPralnicaWSW != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hotelskaPralnicaWSW)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hotelskaPralnicaWSW)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hotelskaPralnicaWSW != null)
      ((javax.xml.rpc.Stub)hotelskaPralnicaWSW)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public si.hotelskapralnica.ws.HotelskaPralnicaWSW getHotelskaPralnicaWSW() {
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW;
  }
  
  public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje narociCiscenje(java.lang.String emso, java.lang.String casPrevzema) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.narociCiscenje(emso, casPrevzema);
  }
  
  public void prekiniStoritev(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    hotelskaPralnicaWSW.prekiniStoritev(emso);
  }
  
  public si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[] delovniCas() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.delovniCas();
  }
  
  public void obvestiRecepcijo(int idPranja) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    hotelskaPralnicaWSW.obvestiRecepcijo(idPranja);
  }
  
  public si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje narociLikanje(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.narociLikanje(emso);
  }
  
  public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[] pridobiVsaPranja() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.pridobiVsaPranja();
  }
  
  public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[] pridobiPranjaZaGosta(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.pridobiPranjaZaGosta(emso);
  }
  
  public void nakupOblacila(java.lang.String emso, si.hotelskapralnica.ws.HotelskaPralnica.Oblacilo.Oblacilo oblacilo, si.hotelskapralnica.ws.HotelskaPralnica.ProdajalnaOblacil.ProdajalnaOblacil prodajalna) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    hotelskaPralnicaWSW.nakupOblacila(emso, oblacilo, prodajalna);
  }
  
  public java.lang.String pralnicaProsta() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.pralnicaProsta();
  }
  
  public double cenaStoritve(java.lang.String[] tipOblacila) throws java.rmi.RemoteException{
    if (hotelskaPralnicaWSW == null)
      _initHotelskaPralnicaWSWProxy();
    return hotelskaPralnicaWSW.cenaStoritve(tipOblacila);
  }
  
  
}