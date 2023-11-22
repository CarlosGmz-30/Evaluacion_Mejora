package mx.edu.utez;

public class factorial {
    public int factorial(int n) {
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
