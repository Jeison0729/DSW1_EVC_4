package com.example.services;

import com.example.model.Beneficiarios;
import com.example.model.Credito;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebService(endpointInterface = "com.example.services.CreditoService")
@Service
public class CreditoServiceImpl implements CreditoService {
    private static final Map<String, Beneficiarios> BD = new ConcurrentHashMap<>();
    private static final Map<String, Credito> SS = new ConcurrentHashMap<>();

    static {

    }
}
