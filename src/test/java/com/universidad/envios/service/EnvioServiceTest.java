package com.universidad.envios.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.universidad.envios.domain.Pedido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EnvioServiceTest {

    @Autowired
    private EnvioService service;

    @Test
    void calcularEnvio_estandar_conTotalAlto_debeSerGratis() {
        Pedido p = new Pedido();
        p.setTotal(60.0);
        assertEquals(0.0, service.calcularEnvio(p, "ESTANDAR"), 0.001);
    }

    @Test
    void aprobarCredito_clienteNulo_debeRechazar() {
        assertEquals("RECHAZADO", service.aprobarCredito(null, 1000));
    }
}
