package main.java.com.company.core.productos;

import main.java.com.company.core.Consumo;
import main.java.com.company.core.Procedencia;

public interface Producto {
    Integer codigo();

    Procedencia procedencia();

    Consumo consumo();
}
