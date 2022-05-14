package ex1;

public class X1 extends Delta {

    public double raizX1(double a, double b, double d) {
        super.setA(a);
        super.setB(b);

        double result1 = -(super.getB() + Math.sqrt(d)) / 2 * super.getA();
        
        return result1;
    }
}
