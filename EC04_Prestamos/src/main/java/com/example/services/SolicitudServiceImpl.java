package com.example.services;

import com.example.model.*;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



@Service
@WebService(endpointInterface = "com.example.services.SolicitudService")
public class SolicitudServiceImpl implements SolicitudService {

    private static final Map<Integer, Clientes> CL = new ConcurrentHashMap<>();
    private static final Map<Integer, Productos> PR = new ConcurrentHashMap<>();
    private static final Map<Integer, TipoCredito> T_CREDITO = new ConcurrentHashMap<>();
    private static final Map<Integer, SolicitudCredito> S_CREDITO = new ConcurrentHashMap<>();

    static {
// Tipos de Crédito - Inversión
        TipoCredito hipoteca = new TipoCredito(
                1, "Crédito Hipotecario",
                50000,
                150000,
                8.5,
                240
        );
        T_CREDITO.put(hipoteca.getIdTipoCredito(), hipoteca);

        TipoCredito construccion = new TipoCredito(
                2, "Crédito para Construcción",
                40000,
                120000,
                9.0,
                180
        );
        T_CREDITO.put(construccion.getIdTipoCredito(), construccion);

        TipoCredito vehicular = new TipoCredito(
                3, "Crédito Vehicular",
                5000,
                25000,
                12.0,
                60
        );
        T_CREDITO.put(vehicular.getIdTipoCredito(), vehicular);

// Tipos de Crédito - Corporativo
        TipoCredito educativo = new TipoCredito(
                4, "Crédito Educativo",
                2000,
                10000,
                6.0,
                48
        );
        T_CREDITO.put(educativo.getIdTipoCredito(), educativo);

        TipoCredito empresarial = new TipoCredito(
                5, "Crédito Empresarial",
                10000,
                50000,
                10.0,
                84
        );
        T_CREDITO.put(empresarial.getIdTipoCredito(), empresarial);

// Tipos de Crédito - Consumo
        TipoCredito tarjetaCredito = new TipoCredito(
                6, "Tarjeta de Crédito",
                1000,
                5000,
                25.0,
                36
        );
        T_CREDITO.put(tarjetaCredito.getIdTipoCredito(), tarjetaCredito);

        TipoCredito libreInversion = new TipoCredito(
                7, "Crédito Libre Inversión",
                3000,
                15000,
                15.0,
                60
        );
        T_CREDITO.put(libreInversion.getIdTipoCredito(), libreInversion);

// Productos -- CUENTAS (no tienen TipoCredito)
        Productos ctaCorriente = new Productos(
                1,
                "Cuenta Corriente",
                TipoProducto.CUENTA,
                null);
        PR.put(ctaCorriente.getIdProducto(), ctaCorriente);

        Productos ctaAhorros = new Productos(
                2,
                "Cuenta Ahorros",
                TipoProducto.CUENTA,
                null);
        PR.put(ctaAhorros.getIdProducto(), ctaAhorros);

// Productos -- CREDITOS
        Productos ctoHipotecario = new Productos(
                3,
                "Crédito Hipotecario",
                TipoProducto.CREDITO,hipoteca
        );
        PR.put(ctoHipotecario.getIdProducto(), ctoHipotecario);

        Productos ctoConstruccion = new Productos(
                4,
                "Crédito para Construcción",
                TipoProducto.CREDITO,
                construccion);
        PR.put(ctoConstruccion.getIdProducto(), ctoConstruccion);

        Productos ctoVehicular = new Productos(
                5,
                "Crédito Vehicular",
                TipoProducto.CREDITO,
                vehicular);
        PR.put(ctoVehicular.getIdProducto(), ctoVehicular);

        Productos ctoEducativo = new Productos(
                6,
                "Crédito Educativo",
                TipoProducto.CREDITO,
                educativo);
        PR.put(ctoEducativo.getIdProducto(), ctoEducativo);

        Productos ctoCapital = new Productos(
                7,
                "Crédito Empresarial",
                TipoProducto.CREDITO,
                empresarial);
        PR.put(ctoCapital.getIdProducto(), ctoCapital);

        Productos ctoTarjeta = new Productos(
                8,
                "Tarjeta crédito",
                TipoProducto.CREDITO, tarjetaCredito);
        PR.put(ctoTarjeta.getIdProducto(), ctoTarjeta);

        Productos ctoLibre = new Productos(
                9,
                "Crédito Libre Inversión",
                TipoProducto.CREDITO,
                libreInversion);
        PR.put(ctoLibre.getIdProducto(), ctoLibre);


// Clientes
        CL.put(1, new Clientes(
                1, 12345678, "Juan Pérez",
                35, "Ingeniero", 4000,
                List.of(ctaCorriente)));

        CL.put(2, new Clientes(
                2, 87654321, "María López",
                29, "Abogada", 5500,
                List.of(ctaCorriente, ctoHipotecario)));

        CL.put(3, new Clientes(
                3, 11223344, "Carlos Gómez",
                22, "Estudiante", 800,
                List.of(ctaCorriente)));

        CL.put(4, new Clientes(
                4, 22334455, "Lucía Torres",
                40, "Comerciante", 3000,
                List.of(ctaCorriente, ctoVehicular)));

        CL.put(5, new Clientes(
                5, 33445566, "Pedro Sánchez",
                50, "Docente", 4200,
                List.of(ctaCorriente)));

        CL.put(6, new Clientes(
                6, 44556677, "Ana Martínez",
                31, "Enfermera", 2800,
                List.of(ctaCorriente, ctoLibre)));

        CL.put(7, new Clientes(
                7, 55667788, "Luis Rojas",
                27, "Programador", 3800,
                List.of(ctaCorriente, ctoHipotecario)));

        CL.put(8, new Clientes(
                8, 66778899, "Sofía Morales",
                24, "Diseñadora", 2500,
                List.of(ctaCorriente)));

        CL.put(9, new Clientes(
                9, 77889900, "Miguel Castro",
                45, "Transportista", 3200,
                List.of(ctaCorriente, ctoVehicular)));

        CL.put(10, new Clientes(
                10, 88990011, "Valeria Herrera",
                37, "Chef", 3100,
                List.of(ctaCorriente)));
    }

    @Override
    public Clientes buscarCliente(int idCliente){
        return CL.get(idCliente);
    }

    @Override
    public List<Clientes> listarClientes(){return  new ArrayList<>(CL.values());}

    //  buscar cliente por número de documento
    public Clientes buscarClienteDni(int dni) {
        return CL.values().stream()
                .filter(c -> c.getDniCliente() == dni)
                .findFirst()
                .orElse(null);
    }

    @Override
    public SolicitudCredito procesarSolicitud(SolicitudCredito solicitud) {
        if (solicitud.getCliente() == null) {
            solicitud.setEstado("RECHAZADO");
            solicitud.setMotivoRechazo("Datos del cliente no proporcionados");
            return solicitud;
        }
        if (solicitud.getTipoCredito() == null) {
            solicitud.setEstado("RECHAZADO");
            solicitud.setMotivoRechazo("Tipo de crédito no especificado");
            return solicitud;
        }

        Clientes cliente = buscarClienteDni(solicitud.getCliente().getDniCliente());
        if (cliente == null) {
            solicitud.setEstado("RECHAZADO");
            solicitud.setMotivoRechazo("Cliente no encontrado");
            return solicitud;
        }

        TipoCredito credito = T_CREDITO.get(solicitud.getTipoCredito().getIdTipoCredito());
        if (credito == null) {
            solicitud.setEstado("RECHAZADO");
            solicitud.setMotivoRechazo("Tipo de crédito inválido");
            return solicitud;
        }

        // Validar usando ValidadorCredito
        String error = ValidadorSolicitud.validar(solicitud, cliente, credito);
        if (error != null) {
            solicitud.setEstado("RECHAZADO");
            solicitud.setMotivoRechazo(error);
            return solicitud;
        }

         // si cumple entonces aprueba
        solicitud.setEstado("APROBADO");
        solicitud.setMotivoRechazo(null);
        int nuevoId = S_CREDITO.size() + 1;
        solicitud.setIdSolicitud(nuevoId);
        solicitud.setFechaSolicitud(LocalDate.now().toString());
        S_CREDITO.put(nuevoId, solicitud);

        return solicitud;
    }



    @Override
    public List<SolicitudCredito> listarSolicitudes() {
        return new ArrayList<>(S_CREDITO.values());
    }



}



