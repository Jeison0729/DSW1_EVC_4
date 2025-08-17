package com.example.controller;

import com.example.model.Clientes;
import com.example.services.SolicitudService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteRestController {

    private final SolicitudService service;

    public ClienteRestController(SolicitudService service) {
        this.service = service;
    }

    // Buscar cliente por ID
    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Clientes> buscarCliente(@PathVariable int id) {
        Clientes cliente = service.buscarCliente(id);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(
            value = "/dni/{dni}",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
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
    @GetMapping( produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<List<Clientes>> listarClientes() {
        return ResponseEntity.ok(service.listarClientes());
    }


}
