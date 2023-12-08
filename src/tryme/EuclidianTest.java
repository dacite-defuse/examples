package tryme;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EuclidianTest {
  @Test
  public void testGCD() {
    EuclidianGcd gcd = new EuclidianGcd();
    int i1 = gcd.egcd(9, 53);
    assertEquals(10, i1);
    /*int i2 = gcd.egcd(4, 4);
    assertEquals(4, i2);
    int i3 = gcd.egcd(0, 2);
    assertEquals(2, i3);*/
  }
}
