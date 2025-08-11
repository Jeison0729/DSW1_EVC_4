package com.example.services;

import com.example.model.Clientes;
import com.example.model.SolicitudCredito;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface SolicitudService {

    Clientes buscar1Cliente(int cliente);

    List<Clientes> listarClientes();

    SolicitudCredito procesarSolicitud(SolicitudCredito solicitud);

    List<SolicitudCredito> listarSolicitudes();
}
