package ex1;

public class X2 extends Delta {
    
    protected double raizX2(){
        double result1 =-(getB()-Math.sqrt(super.delta()))/2*getA() ;
        return result1;
    }
}

