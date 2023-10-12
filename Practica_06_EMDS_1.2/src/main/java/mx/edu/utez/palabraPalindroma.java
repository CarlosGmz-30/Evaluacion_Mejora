package mx.edu.utez;

public class palabraPalindroma {

    public String palindroma(String palabra) {
        String palabraInvertida = "";
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraInvertida = palabra.charAt(i) + palabraInvertida;
        }
        if (palabra.equals(palabraInvertida)) {
            resultado = "La palabra " + palabra + " es palindroma";
            System.out.println(resultado);
        } else {
            resultado = "La palabra " + palabra + " no es palindroma";
            System.out.println(resultado);
        }
        return resultado;

    }
}
