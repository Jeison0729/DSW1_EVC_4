package com.example.controller;

import com.example.model.Clientes;
import com.example.model.SolicitudCredito;
import com.example.services.SolicitudService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class SolicitudRestController {

    private final SolicitudService service;

    public SolicitudRestController(SolicitudService service) {
        this.service = service;
    }

    // Listar todas las solicitudes de crédito
    @GetMapping(value = "/solicitudes", produces = {
            MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE
    })
    public ResponseEntity<List<SolicitudCredito>> listarSolicitudes()
    {
        return ResponseEntity.ok(service.listarSolicitudes());
    }

    // Procesar una solicitud de crédito
    @PostMapping(
            value = "solicitudes/procesar",
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public ResponseEntity<SolicitudCredito> procesarSolicitud(@RequestBody SolicitudCredito solicitud) {
        SolicitudCredito resultado = service.procesarSolicitud(solicitud);
        return ResponseEntity.ok(resultado);
    }

    // Buscar cliente por ID
    @GetMapping(value = "/clientes/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<Clientes> buscarCliente(@PathVariable int id) {
        Clientes cliente = service.buscarCliente(id);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(
            value = "/clientes/{dni}",
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public ResponseEntity<Clientes> buscarClienteDni(@PathVariable int dni) {
        Clientes cliente = service.buscarClienteDni(dni);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // Listar todos los clientes
    @GetMapping(value = "clientes", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<List<Clientes>> listarClientes() {
        return ResponseEntity.ok(service.listarClientes());
    }
}
