package mx.edu.utez;

public class numerosPrimos {

    public String numerosPrimos(int numero) {
        String resultado = "";

        if (numero < 2) {
            resultado = "Los números menores o iguales a 1 no son primos";
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                resultado = "El número " + numero + " es primo";
                System.out.println(resultado);
            } else {
                resultado = "El número " + numero + " no es primo";
                System.out.println(resultado);
            }
        }
        return resultado;
    }
}
