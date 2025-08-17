package com.example.controller;

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
    public ResponseEntity<List<SolicitudCredito>> listarSolicitudes() {
        return ResponseEntity.ok(service.listarSolicitudes());
    }

    // Procesar una solicitud de crédito
    @PostMapping(
            value = "solicitudes/solicitar",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<SolicitudCredito> procesarSolicitud(@RequestBody SolicitudCredito solicitud) {
        SolicitudCredito resultado = service.procesarSolicitud(solicitud);
        return ResponseEntity.ok(resultado);
    }

}
