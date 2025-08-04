package com.example.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement
public class Clientes {

    private int idCliente;
    private int dniCliente;
    private String nombreCliente;
    private int edad;
    private String ocupacion;
    private double ingresosMes;

    // refiere a que un cliente por defecto tiene cuenta,
    // pero puede tener otros productos como creditos u otra cuenta
    private List<Productos> productosAfiliados;

    public Clientes() {
    }

    public Clientes(int idCliente, int dniCliente,
                    String nombreCliente, int edad,
                    String ocupacion, double ingresosMes,
                    List<Productos> productosAfiliados)
    {
        this.idCliente = idCliente;
        this.dniCliente = dniCliente;
        this.nombreCliente = nombreCliente;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.ingresosMes = ingresosMes;
        this.productosAfiliados = productosAfiliados;
    }

    @XmlElement
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @XmlElement
    public List<Productos> getProductosAfiliados() {
        return productosAfiliados;
    }

    public void setProductosAfiliados(List<Productos> productosAfiliados) {
        this.productosAfiliados = productosAfiliados;
    }

    @XmlElement
    public double getIngresosMes() {
        return ingresosMes;
    }

    public void setIngresosMes(double ingresosMes) {
        this.ingresosMes = ingresosMes;
    }

    @XmlElement
    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @XmlElement
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @XmlElement
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    @XmlElement
    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {

        this.dniCliente = dniCliente;
    }


}
