package ex1;

public class X2 extends Delta {
    
    protected double raizX2(double a, double b , double d){
        super.setA(a);
        super.setB(b);

        double result1 =-(getB()-Math.sqrt(d))/2*getA() ;
        return result1;
    }
}

