package mx.edu.utez;

public class areaCirculo {

    public String areaCirculo(double radio) {
        String resultado = "";
        double res;

        if (radio < 0) {
            resultado = "No se puede calcular el área de un círculo con radio negativo";
            System.out.println(resultado);
        } else if (radio == 0) {
            res = 0;
            resultado = "El área de tu círculo con radio " + radio + " es: " + res;
            System.out.println(resultado);
        } else {
            res = Math.PI * Math.pow(radio, 2);
            double resRedondeado = Math.round(res * 1e5) / 1e5;
            resultado = "El área de tu círculo con radio " + radio + " es: " + resRedondeado;
            System.out.println(resultado);
        }
        return resultado;
    }
}
