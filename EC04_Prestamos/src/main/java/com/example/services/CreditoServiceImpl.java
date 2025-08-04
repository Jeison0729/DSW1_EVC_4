package com.example.services;

import com.example.model.Clientes;
import com.example.model.TipoCredito;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebService(endpointInterface = "com.example.services.CreditoService")
@Service
public class CreditoServiceImpl implements CreditoService {
    private static final Map<String, Clientes> BD = new ConcurrentHashMap<>();
    private static final Map<String, TipoCredito> SS = new ConcurrentHashMap<>();

    static {

    }
}
