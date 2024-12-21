package Consultas;

import Modelos.Moneda;

public class FiltroMoneda {
    public double obtenerTasaDeCambio(Moneda moneda, String codigoDestino) {
        return moneda.conversion_rates().getOrDefault(codigoDestino, 0.0);
    }
}
