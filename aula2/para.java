package aula2;

public class para {
    public static void main(String[] args) {
        int limite = 10;
        for (int i = 1; i <= limite; i++) {
            
            System.out.println("tabuada do " + i);

            for (int m = 1; m <= limite; m++) {
                System.out.println(i + " x " + m + " = " + (m * i));
            }
        }

    }
}
