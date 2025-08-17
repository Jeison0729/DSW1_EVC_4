# DSW1_EVC_4
Corresponde como repositorio a la Evaluación Continua 4
Sistema de Solicitudes de Crédito (Académico)
Creado el 27 de julio de 2025
Integrantes:
Jesus Daniel Chavesta
Jeison Andres Ruiz

Funcionalidades

Clientes: búsqueda por ID o DNI y listado completo.

Productos y Créditos: cuentas y créditos con reglas de monto, plazo y tasa.

Solicitudes de crédito:

Validación de edad, ingresos y capacidad de pago.

Reglas específicas según tipo de crédito (hipotecario, vehicular, educativo, etc.).

Estado final: APROBADO o RECHAZADO con motivo.

Un cliente no puede realizar dos solicitudes a un mismo crédito y si posee otro del mismo tipo también será rechazada.

Servicios: REST API y SOAP Web Service para consultas y procesamiento.

Este enlace redirige al Workspace de Postman con los Request correspondientes.
https://surl.li/xifsjd

Arquitectura

Spring Boot para arranque y configuración.

Datos en memoria (simula base de datos).

Separación de responsabilidades:

Service → lógica de negocio

ValidadorSolicitud → validaciones

RestController → exposición de endpoints

Nota

Proyecto académico, sin base de datos ni pruebas automatizadas.

Enfoque en comprensión de flujo de negocio y validaciones de crédito.


