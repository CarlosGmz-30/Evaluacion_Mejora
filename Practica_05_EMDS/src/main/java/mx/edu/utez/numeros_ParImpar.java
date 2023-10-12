package mx.edu.utez;

//Crear un método que me indique si un número es par o impar
public class numeros_ParImpar {

    public String parImpar(int numero) {
        String resultado = "";
        if (numero == 0) {
            resultado = "El número " + numero + " es par";
            System.out.println(resultado);
        } else if (numero % 2 == 0) {
            resultado = "El número " + numero + " es par";
            System.out.println(resultado);
        } else {
            resultado = "El número " + numero + " es impar";
            System.out.println(resultado);
        }
        return resultado;
    }
}
