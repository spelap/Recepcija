/**
 * HotelskaPralnicaServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.hotelskapralnica.ws;

public class HotelskaPralnicaServiceSoapBindingStub extends org.apache.axis.client.Stub implements si.hotelskapralnica.ws.HotelskaPralnicaWSW {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("narociCiscenje");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "casPrevzema"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Pranje", "Pranje"));
        oper.setReturnClass(si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("prekiniStoritev");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delovniCas");
        oper.setReturnType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/DelovniCas", "DelovniCas"));
        oper.setReturnClass(si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("obvestiRecepcijo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idPranja"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("narociLikanje");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Likanje", "Likanje"));
        oper.setReturnClass(si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pridobiVsaPranja");
        oper.setReturnType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Pranje", "Pranje"));
        oper.setReturnClass(si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pridobiPranjaZaGosta");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Pranje", "Pranje"));
        oper.setReturnClass(si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nakupOblacila");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oblacilo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Oblacilo", "Oblacilo"), si.hotelskapralnica.ws.HotelskaPralnica.Oblacilo.Oblacilo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "prodajalna"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/ProdajalnaOblacil", "ProdajalnaOblacil"), si.hotelskapralnica.ws.HotelskaPralnica.ProdajalnaOblacil.ProdajalnaOblacil.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pralnicaProsta");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaFault"),
                      "si.hotelskapralnica.ws.HotelskaPralnicaFaultBean",
                      new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cenaStoritve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tipOblacila"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        oper.setReturnClass(double.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public HotelskaPralnicaServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public HotelskaPralnicaServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public HotelskaPralnicaServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/DelovniCas", "DelovniCas");
            cachedSerQNames.add(qName);
            cls = si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Likanje", "Likanje");
            cachedSerQNames.add(qName);
            cls = si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Oblacilo", "Oblacilo");
            cachedSerQNames.add(qName);
            cls = si.hotelskapralnica.ws.HotelskaPralnica.Oblacilo.Oblacilo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Pranje", "Pranje");
            cachedSerQNames.add(qName);
            cls = si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/ProdajalnaOblacil", "ProdajalnaOblacil");
            cachedSerQNames.add(qName);
            cls = si.hotelskapralnica.ws.HotelskaPralnica.ProdajalnaOblacil.ProdajalnaOblacil.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "hotelskaPralnicaFaultBean");
            cachedSerQNames.add(qName);
            cls = si.hotelskapralnica.ws.HotelskaPralnicaFaultBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje narociCiscenje(java.lang.String emso, java.lang.String casPrevzema) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("narociCiscenje");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "narociCiscenje"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso, casPrevzema});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje) _resp;
            } catch (java.lang.Exception _exception) {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje) org.apache.axis.utils.JavaUtils.convert(_resp, si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void prekiniStoritev(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("prekiniStoritev");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "prekiniStoritev"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[] delovniCas() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("delovniCas");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "delovniCas"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[]) org.apache.axis.utils.JavaUtils.convert(_resp, si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas.DelovniCas[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void obvestiRecepcijo(int idPranja) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("obvestiRecepcijo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "obvestiRecepcijo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(idPranja)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje narociLikanje(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("narociLikanje");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "narociLikanje"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje) _resp;
            } catch (java.lang.Exception _exception) {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje) org.apache.axis.utils.JavaUtils.convert(_resp, si.hotelskapralnica.ws.HotelskaPralnica.Likanje.Likanje.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[] pridobiVsaPranja() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("pridobiVsaPranja");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "pridobiVsaPranja"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[]) org.apache.axis.utils.JavaUtils.convert(_resp, si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[] pridobiPranjaZaGosta(java.lang.String emso) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("pridobiPranjaZaGosta");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "pridobiPranjaZaGosta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[]) org.apache.axis.utils.JavaUtils.convert(_resp, si.hotelskapralnica.ws.HotelskaPralnica.Pranje.Pranje[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void nakupOblacila(java.lang.String emso, si.hotelskapralnica.ws.HotelskaPralnica.Oblacilo.Oblacilo oblacilo, si.hotelskapralnica.ws.HotelskaPralnica.ProdajalnaOblacil.ProdajalnaOblacil prodajalna) throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("nakupOblacila");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "nakupOblacila"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso, oblacilo, prodajalna});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String pralnicaProsta() throws java.rmi.RemoteException, si.hotelskapralnica.ws.HotelskaPralnicaFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("pralnicaProsta");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "pralnicaProsta"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) {
              throw (si.hotelskapralnica.ws.HotelskaPralnicaFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public double cenaStoritve(java.lang.String[] tipOblacila) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("cenaStoritve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "cenaStoritve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {tipOblacila});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Double) _resp).doubleValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_resp, double.class)).doubleValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
