package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Beneficiarios {

    private int idBeneficiario;
    private String nombreBeneficiario;
    private int edad;
    private String ocupacion;
    private double ingresos;

    public Beneficiarios() {
    }

    public Beneficiarios(int idBeneficiario, int edad, String nombreBeneficiario, String ocupacion, double ingresos) {
        this.idBeneficiario = idBeneficiario;
        this.edad = edad;
        this.nombreBeneficiario = nombreBeneficiario;
        this.ocupacion = ocupacion;
        this.ingresos = ingresos;
    }

    @XmlElement
    public int getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(int idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }
    @XmlElement
    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    public void setNombreBeneficiario(String nombreBeneficiario) {
        this.nombreBeneficiario = nombreBeneficiario;
    }
    @XmlElement
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @XmlElement
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    @XmlElement
    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
}
