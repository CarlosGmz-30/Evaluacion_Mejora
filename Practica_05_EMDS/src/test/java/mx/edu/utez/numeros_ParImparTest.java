package mx.edu.utez;

import org.junit.Test;
import org.junit.Assert;

public class numeros_ParImparTest {

    @Test
    public void testParImpar1() {
        numeros_ParImpar numerosParImpar = new numeros_ParImpar();
        int numero = 0;
        String resultadoEsperado = "Tu número 0 es par";
        String resultadoObtenido = numerosParImpar.parImpar(numero);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testParImpar2() {
        numeros_ParImpar numerosParImpar = new numeros_ParImpar();
        int numero = 1;
        String resultadoEsperado = "El número 1 es impar";
        String resultadoObtenido = numerosParImpar.parImpar(numero);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testParImpar3() {
        numeros_ParImpar numerosParImpar = new numeros_ParImpar();
        int numero = 2;
        String resultadoEsperado = "El número 2 es par";
        String resultadoObtenido = numerosParImpar.parImpar(numero);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
}

