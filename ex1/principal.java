package ex1;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        Delta delta = new Delta();
        X1 x1 = new X1();
        X2 x2 = new X2();

      System.out.println("digite o valor de a:");
      double a = Double.parseDouble(sc.nextLine());

      System.out.println("digite o valor de b:");
      double b = Double.parseDouble(sc.nextLine());

      System.out.println("digite o valor de c:");
      double c = Double.parseDouble(sc.nextLine());
     
      double d = delta.calculaDelta(a, b, c);
      System.out.println("delta = " + d);
        
      double resultx = x1.raizX1(a, b, d);
      System.out.println("x1 = " + resultx);
        
      double resultx2 = x2.raizX2(a, b, d);
      System.out.println("x2 = " + resultx2);
    }
}
