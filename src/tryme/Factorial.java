package tryme;

public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        int i = 1;
        while(i <= n){
            result = result * i;
            i = i +1;
        }
        return result;
    }
}


