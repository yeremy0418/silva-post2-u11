package com.universidad.envios.service.estrategias;

import com.universidad.envios.domain.Pedido;
import org.springframework.stereotype.Component;

@Component("GRATIS")
public class EnvioGratis implements EstrategiaEnvio {
    @Override
    public double calcularCosto(Pedido pedido) {
        return 0.0;
    }
}
