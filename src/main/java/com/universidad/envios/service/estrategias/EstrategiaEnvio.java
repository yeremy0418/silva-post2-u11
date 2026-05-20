package com.universidad.envios.service.estrategias;

import com.universidad.envios.domain.Pedido;

public interface EstrategiaEnvio {
    double calcularCosto(Pedido pedido);
}
