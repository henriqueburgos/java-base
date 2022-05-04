package ex1;
import java.lang.Math;

public class Delta extends equacao{


    
  public double delta(){
     double d1= (Math.pow(getB(),2)-4*getA()*getC());
    return d1;
    }

}
