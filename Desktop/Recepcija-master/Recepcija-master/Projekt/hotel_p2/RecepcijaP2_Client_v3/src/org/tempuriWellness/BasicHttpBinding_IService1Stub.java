/**
 * BasicHttpBinding_IService1Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriWellness;

public class BasicHttpBinding_IService1Stub extends org.apache.axis.client.Stub implements org.tempuriWellness.IService1 {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_Rezerviraj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "id_storitev"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "datumUraod"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "datumUrDo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_VrniWellnessStoritve");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfStoritev"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniWellnessStoritveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_VrniRezervacijePoEMSO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfRezervacija"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniRezervacijePoEMSOResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Rezervacija"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_PreklicRezervacijeByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PreklicRezervacijeByIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_VrniCenoStoritve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "idStoritve"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        oper.setReturnClass(java.lang.Double.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniCenoStoritveResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_PrekliciRezervacijePoEMSO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "emso"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PrekliciRezervacijePoEMSOResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_VrniStoritevByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.Storitev.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniStoritevByIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_PrikaziRazpolozljiveStoritve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "datumuraOd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "datumuraDo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfStoritev"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PrikaziRazpolozljiveStoritveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_VrniVseProstore");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfProstor"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniVseProstoreResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Prostor"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_SpremeniStatusRezervaciji");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Rezervacija"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_SpremeniStatusRezervacijiResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_VrniNarocenaCiscenja");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfNarocilaCiscenj"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniNarocenaCiscenjaResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "NarocilaCiscenj"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_NarociCiscenje");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "idProstora"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "opis"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "datumCas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_NarociCiscenjeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_PreklicCiscenja");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "idNarocila"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PreklicCiscenjaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_PrestaviCiscenje");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "idNarocila"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "datumCas"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PrestaviCiscenjeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Wellness_PotrdiOpravljenoCiscenje");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "idNarocila"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PotrdiOpravljenoCiscenjeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"),
                      "org.datacontract.schemas._2004._07.wellness_storitve.CustomExceptionDetails",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails"), 
                      true
                     ));
        _operations[14] = oper;

    }

    public BasicHttpBinding_IService1Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IService1Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IService1Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfNarocilaCiscenj");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "NarocilaCiscenj");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "NarocilaCiscenj");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfProstor");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Prostor");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Prostor");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfRezervacija");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Rezervacija");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Rezervacija");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ArrayOfStoritev");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "CustomExceptionDetails");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "NarocilaCiscenj");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Prostor");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.Prostor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Rezervacija");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.wellness_storitveW.Storitev.class;
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

    public void wellness_Rezerviraj(java.lang.Integer id_storitev, java.lang.String emso, java.util.Calendar datumUraod, java.util.Calendar datumUrDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_Rezerviraj");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_Rezerviraj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id_storitev, emso, datumUraod, datumUrDo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[] wellness_VrniWellnessStoritve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_VrniWellnessStoritve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniWellnessStoritve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[] wellness_VrniRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_VrniRezervacijePoEMSO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniRezervacijePoEMSO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean wellness_PreklicRezervacijeByID(java.lang.Integer ID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_PreklicRezervacijeByID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PreklicRezervacijeByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Double wellness_VrniCenoStoritve(java.lang.Integer idStoritve) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_VrniCenoStoritve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniCenoStoritve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idStoritve});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Double) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Double) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Double.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean wellness_PrekliciRezervacijePoEMSO(java.lang.String emso) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_PrekliciRezervacijePoEMSO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PrekliciRezervacijePoEMSO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {emso});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.Storitev wellness_VrniStoritevByID(java.lang.Integer id) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_VrniStoritevByID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniStoritevByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Storitev) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Storitev) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.Storitev.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[] wellness_PrikaziRazpolozljiveStoritve(java.lang.String datumuraOd, java.lang.String datumuraDo) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_PrikaziRazpolozljiveStoritve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PrikaziRazpolozljiveStoritve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {datumuraOd, datumuraDo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.Storitev[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[] wellness_VrniVseProstore() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_VrniVseProstore");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniVseProstore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.Prostor[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija wellness_SpremeniStatusRezervaciji(java.lang.Integer id, java.lang.String status) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_SpremeniStatusRezervaciji");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_SpremeniStatusRezervaciji"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.Rezervacija.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[] wellness_VrniNarocenaCiscenja() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_VrniNarocenaCiscenja");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_VrniNarocenaCiscenja"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.wellness_storitveW.NarocilaCiscenj[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_NarociCiscenje(java.lang.Integer idProstora, java.lang.String opis, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_NarociCiscenje");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_NarociCiscenje"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idProstora, opis, datumCas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_PreklicCiscenja(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_PreklicCiscenja");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PreklicCiscenja"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idNarocila});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_PrestaviCiscenje(java.lang.Integer idNarocila, java.util.Calendar datumCas) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_PrestaviCiscenje");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PrestaviCiscenje"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idNarocila, datumCas});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo wellness_PotrdiOpravljenoCiscenje(java.lang.Integer idNarocila) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/IService1/Wellness_PotrdiOpravljenoCiscenje");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Wellness_PotrdiOpravljenoCiscenje"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {idNarocila});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.CistilniServis_EntitiesW.Narocilo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) {
              throw (org.datacontract.schemas._2004._07.wellness_storitveW.CustomExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
