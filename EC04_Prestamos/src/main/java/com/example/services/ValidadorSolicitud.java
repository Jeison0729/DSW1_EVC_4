package com.example.services;

import com.example.model.Clientes;
import com.example.model.SolicitudCredito;
import com.example.model.TipoCredito;

public class ValidadorSolicitud {

    public static String validar(
            SolicitudCredito solicitud,
            Clientes cliente,
            TipoCredito credito) {
        if (cliente.getEdad() < 18) {
            return "Menor de edad";
        }

        if (solicitud.getPlazoMeses() <= 0) {
            return "Plazo inválido";
        }

        // Validaciones específicas por tipo de crédito
        switch (credito.getIdTipoCredito()) {
            case 1: // Crédito Hipotecario
                if (solicitud.getMontoSolicitado() < credito.getMontoMinimo())
                    return "Monto mínimo para crédito hipotecario no alcanzado";

                if (solicitud.getPlazoMeses() > credito.getMesesSugeridos())
                    return "Plazo excede el máximo para crédito hipotecario";
                break;

            case 2: // Crédito Construcción
                if (solicitud.getMontoSolicitado() < credito.getMontoMinimo())
                    return "Monto mínimo para crédito construcción no alcanzado";

                if (solicitud.getPlazoMeses() > credito.getMesesSugeridos())
                    return "Plazo excede el máximo para crédito construcción";
                break;

            case 3: // Crédito Vehicular
                if (solicitud.getMontoSolicitado() < credito.getMontoMinimo())
                    return "Monto mínimo para crédito vehicular no alcanzado";

                if (solicitud.getPlazoMeses() > credito.getMesesSugeridos())
                    return "Plazo excede el máximo para crédito vehicular";
                break;

            case 4: // Crédito Educativo
                if (solicitud.getMontoSolicitado() < credito.getMontoMinimo())
                    return "Monto mínimo para crédito educativo no alcanzado";

                if (cliente.getEdad() > 40)
                    return "Edad máxima para crédito educativo excedida";
                break;

            case 5: // Crédito Empresarial
                if (solicitud.getMontoSolicitado() < credito.getMontoMinimo())
                    return "Monto mínimo para crédito empresarial no alcanzado";

                if (cliente.getIngresosMes() < 2000)
                    return "Ingresos insuficientes para crédito empresarial";
                break;

            case 6: // Tarjeta Crédito
                if (cliente.getIngresosMes() < 1500)
                    return "Ingresos insuficientes para tarjeta de crédito";

                if (solicitud.getMontoSolicitado() > credito.getMontoSugerido())
                    return "Monto solicitado excede el límite para tarjeta de crédito";
                break;

            case 7: // Crédito Libre Inversión
                if (solicitud.getMontoSolicitado() < credito.getMontoMinimo())
                    return "Monto mínimo para crédito libre inversión no alcanzado";
                break;

            default:
                return "Tipo de crédito no manejado";
        }

        // Regla general: capacidad de pago (cuota máxima 40% ingreso)
        double cuotaMensual = solicitud.getMontoSolicitado() / solicitud.getPlazoMeses();
        if (cuotaMensual > cliente.getIngresosMes() * 0.4)
            return "Capacidad de pago insuficiente";

        // Si pasa todas las validaciones, devolver null (sin error)
        return null;
    }
}
