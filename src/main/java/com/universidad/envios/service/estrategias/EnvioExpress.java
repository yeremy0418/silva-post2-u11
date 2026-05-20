package com.universidad.envios.service.estrategias;

import com.universidad.envios.domain.Pedido;
import org.springframework.stereotype.Component;

@Component("EXPRESS")
public class EnvioExpress implements EstrategiaEnvio {
    @Override
    public double calcularCosto(Pedido pedido) {
        return 12.99;
    }
}
