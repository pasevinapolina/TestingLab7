import org.junit.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by user
 */
public class CalcTest {

    public Calc calculator;



    @BeforeClass
    public void init() {
        System.out.println("Init calc");
        calculator = new Calc();
    }

    @Test(expectedExceptions = Exception.class)
    public void testDiv() {
        System.out.println("testDiv");
        int result = calculator.div(1, 0);
    }
    @Test(expectedExceptions = Exception.class)
    public void testSum() {
        System.out.println("testSum");
        int result = calculator.sum(1, 0);
    }

    @Test(expectedExceptions = Exception.class)
    public void testMult() {
        System.out.println("testMult");
        int result = calculator.multiply(1, 0);
    }

    @Test(expectedExceptions = Exception.class)
    public void testSub() {
        System.out.println("testSub");
        int result = calculator.sub(1, 0);
    }
}
