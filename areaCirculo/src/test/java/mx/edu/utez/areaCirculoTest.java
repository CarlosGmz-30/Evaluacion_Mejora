package mx.edu.utez;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class areaCirculoTest {

    @Test
    public void pruebaCirculo1() {
        areaCirculo areaCirculo = new areaCirculo();
        double numero = 0;
        String esperado = "El área de tu círculo con radio 0.0 es: 0.0";
        String obtenido = areaCirculo.areaCirculo(numero);

        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void pruebaCirculo2() {
        areaCirculo areaCirculo = new areaCirculo();
        double numero = -5;
        String esperado = "No se puede calcular el área de un círculo con radio negativo";
        String obtenido = areaCirculo.areaCirculo(numero);

        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void pruebaCirculo3() {
        areaCirculo areaCirculo = new areaCirculo();
        double numero = 10;
        String esperado = "El área de tu círculo con radio 10.0 es: 314.15927";
        String obtenido = areaCirculo.areaCirculo(numero);

        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void pruebaCirculo4() {
        areaCirculo areaCirculo = new areaCirculo();
        double numero = 1;
        String esperado = "El área de tu círculo con radio 1.0 es: 3.14159";
        String obtenido = areaCirculo.areaCirculo(numero);

        Assert.assertEquals(esperado, obtenido);
    }
}