package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Productos {

    private int idProducto;
    private String nombreProducto;
    // Ej: "CUENTA", "CREDITO"

    // Ej: "Cuenta Corriente", "Crédito Hipotecario"
    private TipoProducto tipoProducto;

    // Solo si es un producto de tipo CREDITO (puede ser null)
    private TipoCredito tipoCredito;


    public Productos() {
    }

    public Productos(int idProducto, TipoProducto tipoProducto, String nombreProducto, TipoCredito tipoCredito) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.nombreProducto = nombreProducto;
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
    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @XmlElement
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @XmlElement
    public TipoCredito getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(TipoCredito tipoCredito) {
        this.tipoCredito = tipoCredito;
    }
}
