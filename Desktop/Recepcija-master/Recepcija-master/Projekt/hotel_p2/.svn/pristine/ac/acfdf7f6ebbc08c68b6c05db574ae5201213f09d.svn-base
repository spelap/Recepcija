/**
 * HotelskaPralnicaServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.hotelskapralnica.ws;

public class HotelskaPralnicaServiceLocator extends org.apache.axis.client.Service implements si.hotelskapralnica.ws.HotelskaPralnicaService {

    public HotelskaPralnicaServiceLocator() {
    }


    public HotelskaPralnicaServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HotelskaPralnicaServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HotelskaPralnicaPort
    private java.lang.String HotelskaPralnicaPort_address = "http://soa.informatika.uni-mb.si:8080/HotelskaPralnica_v4/HotelskaPralnica";

    public java.lang.String getHotelskaPralnicaPortAddress() {
        return HotelskaPralnicaPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HotelskaPralnicaPortWSDDServiceName = "HotelskaPralnicaPort";

    public java.lang.String getHotelskaPralnicaPortWSDDServiceName() {
        return HotelskaPralnicaPortWSDDServiceName;
    }

    public void setHotelskaPralnicaPortWSDDServiceName(java.lang.String name) {
        HotelskaPralnicaPortWSDDServiceName = name;
    }

    public si.hotelskapralnica.ws.HotelskaPralnicaWSW getHotelskaPralnicaPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HotelskaPralnicaPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHotelskaPralnicaPort(endpoint);
    }

    public si.hotelskapralnica.ws.HotelskaPralnicaWSW getHotelskaPralnicaPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            si.hotelskapralnica.ws.HotelskaPralnicaServiceSoapBindingStub _stub = new si.hotelskapralnica.ws.HotelskaPralnicaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHotelskaPralnicaPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHotelskaPralnicaPortEndpointAddress(java.lang.String address) {
        HotelskaPralnicaPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (si.hotelskapralnica.ws.HotelskaPralnicaWSW.class.isAssignableFrom(serviceEndpointInterface)) {
                si.hotelskapralnica.ws.HotelskaPralnicaServiceSoapBindingStub _stub = new si.hotelskapralnica.ws.HotelskaPralnicaServiceSoapBindingStub(new java.net.URL(HotelskaPralnicaPort_address), this);
                _stub.setPortName(getHotelskaPralnicaPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HotelskaPralnicaPort".equals(inputPortName)) {
            return getHotelskaPralnicaPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.hotelskapralnica.si/", "HotelskaPralnicaPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HotelskaPralnicaPort".equals(portName)) {
            setHotelskaPralnicaPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
