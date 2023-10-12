package mx.edu.utez;

import org.junit.Assert;
import org.junit.Test;

public class palabraPalindromaTest {

    @Test
    public void testPalindroma1() {
        palabraPalindroma palindroma = new palabraPalindroma();
        String palabra = "reconocer";
        String resultadoEsperado = "La palabra reconocer es palindroma";
        String resultadoObtenido = palindroma.palindroma(palabra);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testPalindroma2() {
        palabraPalindroma palindroma = new palabraPalindroma();
        String palabra = "palabra";
        String resultadoEsperado = "La palabra palabra no es palindroma";
        String resultadoObtenido = palindroma.palindroma(palabra);

        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

}