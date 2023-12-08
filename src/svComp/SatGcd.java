package svComp;

import org.junit.Test;

public class SatGcd {
    public SatGcd() {
    }

    static int gcd(int y1, int y2) {
        if (y1 <= 0 || y2 <= 0) {
            return 0;
        }
        if (y1 == y2) {
            return y1;
        }
        if (y1 > y2) {
            return gcd(y1 - y2, y2);
        }
        return gcd(y1, y2 - y1);
    }


    @Test
    public void testGCD() {
        int i = gcd(94, 530);
    }
}
