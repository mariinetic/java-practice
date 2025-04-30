package fatec.introdutorio.ex4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testComplexOperations() {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);

        assertEquals("(3,000000, 4,000000)", c1.toString());
        assertEquals("(1,000000, 2,000000)", c2.toString());

        Complex sum = c1.add(c2);
        assertEquals("(4,000000, 6,000000)", sum.toString());

        Complex diff = c1.subtract(c2);
        assertEquals("(2,000000, 2,000000)", diff.toString());

        Complex product = c1.multiply(c2);
        assertEquals("(-5,000000, 10,000000)", product.toString());

        Complex quotient = c1.divide(c2);
        assertEquals("(2,200000, -0,400000)", quotient.toString());
    }

    @Test
    public void testModulusAndArgument() {
        Complex c1 = new Complex(3, 4);
        assertEquals(5.0, c1.modulus(), 0.01);
        assertEquals(0.927, c1.argument(), 0.01);
    }

    @Test
    public void testInverse() {
        Complex c1 = new Complex(3, 4);
        Complex inverse = c1.inverse();
        assertEquals("(-3,000000, -4,000000)", inverse.toString());
    }
}
