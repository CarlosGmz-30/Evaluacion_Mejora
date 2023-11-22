package mx.edu.utez;

import org.junit.Assert;
import org.junit.Test;

public class reverseStringTest {

    @Test
    public void primeraPrueba() {
        reverseString reverseString = new reverseString();
        String str = "hola";
        String resultadoEsperado = "aloh";
        String resultadoObtenido = reverseString.reverseString(str);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void segundaPrueba() {
        reverseString reverseString = new reverseString();
        String str = "";
        String resultadoEsperado = "";
        String resultadoObtenido = reverseString.reverseString(str);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void terceraPrueba() {
        reverseString reverseString = new reverseString();
        String str = "ca30los";
        String resultadoEsperado = "sol03ac";
        String resultadoObtenido = reverseString.reverseString(str);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void cuartaPrueba() {
        reverseString reverseString = new reverseString();
        String str = "ca30los,";
        String resultadoEsperado = ",sol03ac";
        String resultadoObtenido = reverseString.reverseString(str);
        Assert.assertEquals(resultadoEsperado, resultadoObtenido);
    }
}
