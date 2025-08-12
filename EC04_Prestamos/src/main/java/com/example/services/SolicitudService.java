package com.example.services;

import com.example.model.Clientes;
import com.example.model.SolicitudCredito;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface SolicitudService {

    Clientes buscarCliente(int idCliente);

    Clientes buscarClienteDni(int dni);

    List<Clientes> listarClientes();

    SolicitudCredito procesarSolicitud(SolicitudCredito solicitud);

    List<SolicitudCredito> listarSolicitudes();
}
