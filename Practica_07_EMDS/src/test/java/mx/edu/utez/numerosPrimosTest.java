package mx.edu.utez;

import org.junit.Assert;
import org.junit.Test;

public class numerosPrimosTest {
    @Test
    public void testNumerosPrimos1() {
        numerosPrimos numeroPrimo = new numerosPrimos();
        int numero = 5;
        String resultadoEsperado = "El número 5 es primo";
        String resultadoObtenido = numeroPrimo.numerosPrimos(numero);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testNumerosPrimos2() {
        numerosPrimos numeroPrimo = new numerosPrimos();
        int numero = 12;
        String resultadoEsperado = "El número 12 no es primo";
        String resultadoObtenido = numeroPrimo.numerosPrimos(numero);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);

    }

    @Test
    public void numerosPrimos() {
    }
}