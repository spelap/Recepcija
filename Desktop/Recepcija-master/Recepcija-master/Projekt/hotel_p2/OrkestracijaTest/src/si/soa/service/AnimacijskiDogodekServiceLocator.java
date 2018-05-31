/**
 * AnimacijskiDogodekServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.soa.service;

public class AnimacijskiDogodekServiceLocator extends org.apache.axis.client.Service implements si.soa.service.AnimacijskiDogodekService {

    public AnimacijskiDogodekServiceLocator() {
    }


    public AnimacijskiDogodekServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AnimacijskiDogodekServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AnimacijskiDogodekPort
    private java.lang.String AnimacijskiDogodekPort_address = "http://soa.informatika.uni-mb.si:8080/AnimacijskiDogodki_v4/AnimacijskiDogodek";

    public java.lang.String getAnimacijskiDogodekPortAddress() {
        return AnimacijskiDogodekPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AnimacijskiDogodekPortWSDDServiceName = "AnimacijskiDogodekPort";

    public java.lang.String getAnimacijskiDogodekPortWSDDServiceName() {
        return AnimacijskiDogodekPortWSDDServiceName;
    }

    public void setAnimacijskiDogodekPortWSDDServiceName(java.lang.String name) {
        AnimacijskiDogodekPortWSDDServiceName = name;
    }

    public si.soa.service.AnimacijskiDogodek getAnimacijskiDogodekPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AnimacijskiDogodekPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAnimacijskiDogodekPort(endpoint);
    }

    public si.soa.service.AnimacijskiDogodek getAnimacijskiDogodekPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            si.soa.service.AnimacijskiDogodekServiceSoapBindingStub _stub = new si.soa.service.AnimacijskiDogodekServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAnimacijskiDogodekPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAnimacijskiDogodekPortEndpointAddress(java.lang.String address) {
        AnimacijskiDogodekPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (si.soa.service.AnimacijskiDogodek.class.isAssignableFrom(serviceEndpointInterface)) {
                si.soa.service.AnimacijskiDogodekServiceSoapBindingStub _stub = new si.soa.service.AnimacijskiDogodekServiceSoapBindingStub(new java.net.URL(AnimacijskiDogodekPort_address), this);
                _stub.setPortName(getAnimacijskiDogodekPortWSDDServiceName());
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
        if ("AnimacijskiDogodekPort".equals(inputPortName)) {
            return getAnimacijskiDogodekPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soa.si/", "AnimacijskiDogodekService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soa.si/", "AnimacijskiDogodekPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AnimacijskiDogodekPort".equals(portName)) {
            setAnimacijskiDogodekPortEndpointAddress(address);
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
