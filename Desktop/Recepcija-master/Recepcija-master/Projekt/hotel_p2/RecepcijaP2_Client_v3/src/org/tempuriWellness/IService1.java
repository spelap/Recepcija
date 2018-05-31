/**
 * IService1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriWellness;

public interface IService1 extends java.rmi.Remote {
    public void wellness_Rezerviraj(java.lang.Integer id_storitev, java.lang.String emso, java.util.Calendar datumUraod, java.util.Calendar datumUrDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[] wellness_VrniWellnessStoritve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[] wellness_VrniRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public java.lang.Boolean wellness_PreklicRezervacijeByID(java.lang.Integer ID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public java.lang.Double wellness_VrniCenoStoritve(java.lang.Integer idStoritve) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public java.lang.Boolean wellness_PrekliciRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.Storitev wellness_VrniStoritevByID(java.lang.Integer id) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[] wellness_PrikaziRazpolozljiveStoritve(java.lang.String datumuraOd, java.lang.String datumuraDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[] wellness_VrniVseProstore() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija wellness_SpremeniStatusRezervaciji(java.lang.Integer id, java.lang.String status) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[] wellness_VrniNarocenaCiscenja() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_NarociCiscenje(java.lang.Integer idProstora, java.lang.String opis, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_PreklicCiscenja(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_PrestaviCiscenje(java.lang.Integer idNarocila, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_PotrdiOpravljenoCiscenje(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails;
}
