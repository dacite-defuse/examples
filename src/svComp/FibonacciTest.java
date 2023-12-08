package svComp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void TestFibonacci0() {
        //int y = 5;
        int n = Fibonacci.fibonacci(1);
        assertEquals(5, n);
    }
}

