package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Credito {
    private String tipoCredito;
    private double montoAprobado;
    private double tasaIntAnual;
    private String fechaCorte;
    private int plazoMeses;

    public Credito() {
    }

    public Credito(String tipoCredito, double montoAprobado, double tasaIntAnual, String fechaCorte, int plazoMeses) {
        this.tipoCredito = tipoCredito;
        this.montoAprobado = montoAprobado;
        this.tasaIntAnual = tasaIntAnual;
        this.fechaCorte = fechaCorte;
        this.plazoMeses = plazoMeses;
    }
    @XmlElement
    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }
    @XmlElement
    public double getMontoAprobado() {
        return montoAprobado;
    }

    public void setMontoAprobado(double montoAprobado) {
        this.montoAprobado = montoAprobado;
    }
    @XmlElement
    public double getTasaIntAnual() {
        return tasaIntAnual;
    }

    public void setTasaIntAnual(double tasaIntAnual) {
        this.tasaIntAnual = tasaIntAnual;
    }
    @XmlElement
    public String getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(String fechaCorte) {
        this.fechaCorte = fechaCorte;
    }
    @XmlElement
    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }
}
