package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TipoCredito {
    private int idTipoCredito;
    private int idProducto;
    private String tipoCredito;
    private double montoMinimo;
    private double montoSugerido;
    private double tasaIntAnual;
    private int mesesSugeridos;

    public TipoCredito() {
    }

    public TipoCredito(int idTipoCredito,
                       int idProducto,
                       String tipoCredito,
                       double montoMinimo,
                       double montoSugerido,
                       double tasaIntAnual,
                       int mesesSugeridos)
    {
        this.idTipoCredito = idTipoCredito;
        this.idProducto = idProducto;
        this.tipoCredito = tipoCredito;
        this.montoMinimo = montoMinimo;
        this.montoSugerido = montoSugerido;
        this.tasaIntAnual = tasaIntAnual;
        this.mesesSugeridos = mesesSugeridos;
    }

    @XmlElement

    public int getIdTipoCredito() {
        return idTipoCredito;
    }

    public void setIdTipoCredito(int idTipoCredito) {
        this.idTipoCredito = idTipoCredito;
    }

    @XmlElement
    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    @XmlElement
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @XmlElement
    public double getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    @XmlElement
    public double getMontoSugerido() {
        return montoSugerido;
    }

    public void setMontoSugerido(double montoSugerido) {
        this.montoSugerido = montoSugerido;
    }

    @XmlElement
    public double getTasaIntAnual() {
        return tasaIntAnual;
    }

    public void setTasaIntAnual(double tasaIntAnual) {
        this.tasaIntAnual = tasaIntAnual;
    }

    @XmlElement
    public int getMesesSugeridos() {
        return mesesSugeridos;
    }

    public void setMesesSugeridos(int mesesSugeridos) {
        this.mesesSugeridos = mesesSugeridos;
    }
}
