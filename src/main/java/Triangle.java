/**
 * Created by user
 */
public class Triangle {

    private int a;
    private int b;
    private int c;

    private static final String EQUILATERAL  = "Equilateral triangle";
    private static final String  ISOSCELES  = "Isosceles triangle";
    private static final String  SCALENE  = "Scalene triangle";

    public Triangle(int a, int b, int c)
    {
        if(!isSidesValid(a, b, c)) {
            System.err.println("Invalid arguments!");

        }

        this.a = a;
        this.b = b;
        this.c = c;

    }
    private boolean isSidesValid(int a, int b, int c) {
        if(a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if(a > b + c || b > a + c || c > a + b) {
            return false;
        }
        return true;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - c)
                * (halfPerimeter - b) * (halfPerimeter - a));
    }

    public String getKind() {
        if(a == b || b == c || a == c) {
            if(a == b && a == c) {
                return EQUILATERAL + " and "+ ISOSCELES;
            } else {
                return ISOSCELES;
            }
        } else {
            return SCALENE;
        }
    }

    @Override
    public String toString() {
        return " " + Integer.toString(getPerimeter())
                + " " + Double.toString(getArea()) + " " + getKind();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
