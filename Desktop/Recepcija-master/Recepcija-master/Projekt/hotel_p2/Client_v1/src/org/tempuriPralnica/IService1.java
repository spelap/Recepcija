/**
 * IService1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriPralnica;

public interface IService1 extends java.rmi.Remote {
    public void wellness_Rezerviraj(java.lang.Integer id_storitev, java.lang.String emso, java.util.Calendar datumUraod, java.util.Calendar datumUrDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public java.lang.Boolean wellness_PreveriRazpolozljivost(org.datacontract.schemas._2004._07.wellness_storitve.Storitev s, java.util.Calendar datumura) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public void wellness_PreklicRezervacije(org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija r) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_PrikaziRazpolozljiveStoritve(java.util.Calendar datumuraOd, java.util.Calendar datumuraDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_VrniWellnessStoritve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija[] wellness_VrniRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public java.lang.Boolean wellness_PreklicRezervacijeByID(java.lang.Integer ID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
}
