/**
 * IService1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriWellness;

public interface IService1 extends java.rmi.Remote {
    public void wellness_Rezerviraj(java.lang.Integer id_storitev, java.lang.String emso, java.lang.String datumUraod, java.lang.String datumUrDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_VrniWellnessStoritve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija[] wellness_VrniRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public java.lang.Boolean wellness_PreklicRezervacijeByID(java.lang.Integer ID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public java.lang.Double wellness_VrniCenoStoritve(java.lang.Integer idStoritve) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public java.lang.Boolean wellness_PrekliciRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Storitev wellness_VrniStoritevByID(java.lang.Integer id) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Storitev[] wellness_PrikaziRazpolozljiveStoritve(java.lang.String datumuraOd, java.lang.String datumuraDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Prostor[] wellness_VrniVseProstore() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.Rezervacija wellness_SpremeniStatusRezervaciji(java.lang.Integer id, java.lang.String status) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitve.NarocilaCiscenj[] wellness_VrniNarocenaCiscenja() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_NarociCiscenje(java.lang.Integer idProstora, java.lang.String opis, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_PreklicCiscenja(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_PrestaviCiscenje(java.lang.Integer idNarocila, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo wellness_PotrdiOpravljenoCiscenje(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails;
}
