package ex1;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        Delta delta = new Delta();
        X1 x1 = new X1();
        X2 x2 = new X2();

      System.out.println( delta.delta());
      System.out.println(x1.raizX1());
      System.out.println(x2.raizX2());

        
    }
}
