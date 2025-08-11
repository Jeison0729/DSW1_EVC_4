package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SolicitudCredito { 

    private int idSolicitud;
    private Clientes cliente;
    private TipoCredito tipoCredito;
    private double montoSolicitado;
    private int plazoMeses;
    private String fechaSolicitud;
    private String estado; //  "APROBADO" o "RECHAZADO"
    private String motivoRechazo;

    public SolicitudCredito() {
    }

    public SolicitudCredito(int idSolicitud, Clientes cliente, TipoCredito tipoCredito, double montoSolicitado, int plazoMeses, String fechaSolicitud, String estado, String motivoRechazo) {
        this.idSolicitud = idSolicitud;
        this.cliente = cliente;
        this.tipoCredito = tipoCredito;
        this.montoSolicitado = montoSolicitado;
        this.plazoMeses = plazoMeses;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
        this.motivoRechazo = motivoRechazo;
    }

    @XmlElement
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @XmlElement
    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @XmlElement
    public TipoCredito getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(TipoCredito tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    @XmlElement
    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    @XmlElement
    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    @XmlElement
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @XmlElement
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlElement
    public String getMotivoRechazo() {
        return motivoRechazo;
    }

    public void setMotivoRechazo(String motivoRechazo) {
        this.motivoRechazo = motivoRechazo;
    }
}