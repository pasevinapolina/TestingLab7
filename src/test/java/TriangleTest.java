import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by user
 */
public class TriangleTest {

    @DataProvider
    public static Object[][] triangles() {
        return new Object[][] {
                {3, 4, 5, 6, 12},
                {6, 8, 10, 24, 24}
        };
    }

    @DataProvider
    public static Object[][] incorrectTriangles() {
        return new Object[][] {
                {3, 4, 0},
                {6, 0, 10},
                {-1, 4, 6},
                {3, -7, 1},
                {7, 2, 4}
        };
    }


    @Test(dataProvider = "triangles")
    public void testArea(int a, int b, int c, double correctArea, int correctPerimeter) throws Exception {
        Triangle triangle = new Triangle(a, b, c);
        Assert.assertEquals(correctArea, triangle.getArea());
        Assert.assertEquals(correctPerimeter, triangle.getPerimeter());
    }

    @Test(dataProvider = "incorrectTriangles", expectedExceptions = Exception.class)
    public void testConstructor(int a, int b, int c) throws Exception {
        Triangle triangle = new Triangle(a, b, c);
    }




}
