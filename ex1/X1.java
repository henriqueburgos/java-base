package ex1;

public class X1 extends Delta{
     
   protected double raizX1(){
        double result1 =-(getB()+Math.sqrt(super.delta()))/2*getA() ;
        return result1;
    }
}
