/**
 * RezervacijaSobLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class RezervacijaSobLocator extends org.apache.axis.client.Service implements org.tempuriRezervacija.RezervacijaSob {

    public RezervacijaSobLocator() {
    }


    public RezervacijaSobLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RezervacijaSobLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IRezervacijaSob
    private java.lang.String BasicHttpBinding_IRezervacijaSob_address = "http://soa.informatika.uni-mb.si/P1_RezervacijaSob/RezervacijaSob.svc/soap";

    public java.lang.String getBasicHttpBinding_IRezervacijaSobAddress() {
        return BasicHttpBinding_IRezervacijaSob_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IRezervacijaSobWSDDServiceName = "BasicHttpBinding_IRezervacijaSob";

    public java.lang.String getBasicHttpBinding_IRezervacijaSobWSDDServiceName() {
        return BasicHttpBinding_IRezervacijaSobWSDDServiceName;
    }

    public void setBasicHttpBinding_IRezervacijaSobWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IRezervacijaSobWSDDServiceName = name;
    }

    public org.tempuriRezervacija.IRezervacijaSob getBasicHttpBinding_IRezervacijaSob() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IRezervacijaSob_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IRezervacijaSob(endpoint);
    }

    public org.tempuriRezervacija.IRezervacijaSob getBasicHttpBinding_IRezervacijaSob(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuriRezervacija.BasicHttpBinding_IRezervacijaSobStub _stub = new org.tempuriRezervacija.BasicHttpBinding_IRezervacijaSobStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IRezervacijaSobWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IRezervacijaSobEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IRezervacijaSob_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuriRezervacija.IRezervacijaSob.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuriRezervacija.BasicHttpBinding_IRezervacijaSobStub _stub = new org.tempuriRezervacija.BasicHttpBinding_IRezervacijaSobStub(new java.net.URL(BasicHttpBinding_IRezervacijaSob_address), this);
                _stub.setPortName(getBasicHttpBinding_IRezervacijaSobWSDDServiceName());
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
        if ("BasicHttpBinding_IRezervacijaSob".equals(inputPortName)) {
            return getBasicHttpBinding_IRezervacijaSob();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "RezervacijaSob");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IRezervacijaSob"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IRezervacijaSob".equals(portName)) {
            setBasicHttpBinding_IRezervacijaSobEndpointAddress(address);
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
