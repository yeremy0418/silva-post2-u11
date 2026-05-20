package com.universidad.envios.service;

import com.universidad.envios.domain.Cliente;
import com.universidad.envios.domain.Pedido;
import com.universidad.envios.service.estrategias.EstrategiaEnvio;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class EnvioService {
    private final Map<String, EstrategiaEnvio> estrategias;

    public EnvioService(Map<String, EstrategiaEnvio> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcularEnvio(Pedido pedido, String tipoEnvio) {
        return Optional.ofNullable(estrategias.get(tipoEnvio))
                .orElseThrow(() -> new IllegalArgumentException(tipoEnvio))
                .calcularCosto(pedido);
    }

    public String aprobarCredito(Cliente c, double monto) {
        if (c == null) return "RECHAZADO";
        if (!c.isActivo()) return "RECHAZADO";
        if (c.getScore() < 600) return "RECHAZADO";
        if (monto <= 0) return "RECHAZADO";
        if (monto > c.getLimiteCredito()) return "RECHAZADO";
        return "APROBADO";
    }
}
