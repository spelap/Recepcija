package si.soa.service;

public class AnimacijskiDogodekProxy implements si.soa.service.AnimacijskiDogodek {
  private String _endpoint = null;
  private si.soa.service.AnimacijskiDogodek animacijskiDogodek = null;
  
  public AnimacijskiDogodekProxy() {
    _initAnimacijskiDogodekProxy();
  }
  
  public AnimacijskiDogodekProxy(String endpoint) {
    _endpoint = endpoint;
    _initAnimacijskiDogodekProxy();
  }
  
  private void _initAnimacijskiDogodekProxy() {
    try {
      animacijskiDogodek = (new si.soa.service.AnimacijskiDogodekServiceLocator()).getAnimacijskiDogodekPort();
      if (animacijskiDogodek != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)animacijskiDogodek)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)animacijskiDogodek)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (animacijskiDogodek != null)
      ((javax.xml.rpc.Stub)animacijskiDogodek)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public si.soa.service.AnimacijskiDogodek getAnimacijskiDogodek() {
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    return animacijskiDogodek;
  }
  
  public double izracunajCeno(int arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    return animacijskiDogodek.izracunajCeno(arg0, arg1, arg2);
  }
  
  public si.soa.service.Dogodek[] najdiDogodke(java.lang.String iskalniNiz) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    return animacijskiDogodek.najdiDogodke(iskalniNiz);
  }
  
  public double odpovedPrijave(java.lang.String emso, int idDogodka, int steviloOdpovedanihOdraslih, int steviloOdpoveadnihOtrok) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    return animacijskiDogodek.odpovedPrijave(emso, idDogodka, steviloOdpovedanihOdraslih, steviloOdpoveadnihOtrok);
  }
  
  public double prijavaNaDogodek(java.lang.String emso, int idDogodka, int steviloOdraslih, int steviloOtrok) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    return animacijskiDogodek.prijavaNaDogodek(emso, idDogodka, steviloOdraslih, steviloOtrok);
  }
  
  public void spremeniDogodek(int id, java.lang.String naziv, java.lang.String tip, java.lang.String lokacija, java.util.Calendar zacetek, java.util.Calendar konec, int st_prostih_mest, double cena_otroci, double cena_odrasli, boolean dogodekIzvenHotela, java.util.Calendar zadnji_rok_za_projavo, boolean odpovedano, boolean wellnessDogodek) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    animacijskiDogodek.spremeniDogodek(id, naziv, tip, lokacija, zacetek, konec, st_prostih_mest, cena_otroci, cena_odrasli, dogodekIzvenHotela, zadnji_rok_za_projavo, odpovedano, wellnessDogodek);
  }
  
  public void odpovedDogodka(int idDogodka) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    animacijskiDogodek.odpovedDogodka(idDogodka);
  }
  
  public void ustvariNovDogodek(java.lang.String naziv, java.lang.String tip, java.lang.String lokacija, java.util.Calendar zacetek, java.util.Calendar konec, int st_prostih_mest, double cena_otroci, double cena_odrasli, boolean dogodekIzvenHotela, java.util.Calendar zadnji_rok_za_projavo, boolean wellnessDogodek) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    animacijskiDogodek.ustvariNovDogodek(naziv, tip, lokacija, zacetek, konec, st_prostih_mest, cena_otroci, cena_odrasli, dogodekIzvenHotela, zadnji_rok_za_projavo, wellnessDogodek);
  }
  
  public si.soa.service.Dogodek podrobnostiDogodka(int id_dogodka) throws java.rmi.RemoteException{
    if (animacijskiDogodek == null)
      _initAnimacijskiDogodekProxy();
    return animacijskiDogodek.podrobnostiDogodka(id_dogodka);
  }
  
  
}