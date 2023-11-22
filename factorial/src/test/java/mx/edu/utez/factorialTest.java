package mx.edu.utez;

import org.junit.Assert;
import org.junit.Test;


public class factorialTest {

    @Test
    public void pruebaUno() {
        factorial factorial = new factorial();
        int numero = 7;
        int esperado = 5040;
        int obtenido = factorial.factorial(numero);
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void pruebaDos() {
        factorial factorial = new factorial();
        int numero = 0;
        int esperado = 1;
        int obtenido = factorial.factorial(numero);
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void pruebaTres() {
        factorial factorial = new factorial();
        int numero = 10;
        int esperado = 3628800;
        int obtenido = factorial.factorial(numero);
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void pruebaCuatro() {
        factorial factorial = new factorial();
        int numero = 2;
        int esperado = 2;
        int obtenido = factorial.factorial(numero);
        Assert.assertEquals(esperado, obtenido);
    }
}