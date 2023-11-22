package mx.edu.utez;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class isPalindromeTest {

    @Test
    public void palindromeUno() {
        isPalindrome isPalindrome = new isPalindrome();
        String palabra = "aba";
        Boolean esperado = true;
        Boolean obtenio = isPalindrome.isPalindrome(palabra);
        Assert.assertEquals(esperado, obtenio);
    }

    @Test
    public void palindromeDos() {
        isPalindrome isPalindrome = new isPalindrome();
        String palabra = "nadar";
        Boolean esperado = false;
        Boolean obtenio = isPalindrome.isPalindrome(palabra);
        Assert.assertEquals(esperado, obtenio);
    }

    @Test
    public void palindromeTres() {
        isPalindrome isPalindrome = new isPalindrome();
        String palabra = "1001";
        Boolean esperado = true;
        Boolean obtenio = isPalindrome.isPalindrome(palabra);
        Assert.assertEquals(esperado, obtenio);
    }

    @Test
    public void palindromeCuatro() {
        isPalindrome isPalindrome = new isPalindrome();
        String palabra = ";1010";
        Boolean esperado = false;
        Boolean obtenio = isPalindrome.isPalindrome(palabra);
        Assert.assertEquals(esperado, obtenio);
    }
}