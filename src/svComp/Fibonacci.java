package svComp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonacci {

    public static int fibonacci(int k) {
        if (k == 0) {
            return 0;
        } else if (k == 1) {
            return 1;
        } else {
            return fibonacci(k- 1) + fibonacci(k - 2);
        } 
    }

    /* @Test
    public void TestFibonacci0() {
        int y = 5;
        int n = fibonacci(y);
        assertEquals(5, n);
    }*/
}

