package aula3;

import java.util.Random;

public class vetores {

    public static void main(String[] args) {

        Random randomico = new Random();
        double[] valores={
            randomico.nextInt(30),
            randomico.nextInt(30),
            randomico.nextInt(30),
            randomico.nextInt(30),
        };
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
