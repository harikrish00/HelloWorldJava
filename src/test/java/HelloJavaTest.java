
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloJavaTest {

    @Test
    public void testAdd() {
      assertEquals(2+2, 4);
    }

    @Test
    public void testSubtract() {
      assertEquals(4-2, 2);
    }

    @Test
    public void testDivide() {
      assertEquals(10/2, 5);
    }

    @Test
    public void testMultiply() {
      assertEquals(4*5, 20);
    }
}
