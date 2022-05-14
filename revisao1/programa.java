package revisao1;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mamiferos m1 = new Mamiferos();
        for (String resfinal="s"; resfinal.equals("n"); resfinal="s") {
            System.out.println("você quer add algo novo no inventario? responda com [s] ou  [n]");
            resfinal = sc.nextLine();

            if (resfinal.equals("s")) {

                System.out.println("você quer add um mamifero ao seu inventario? responda com [s] ou  [n]");
                String res = sc.nextLine();
                System.out.println("------------------------------------------------------------------------------");
                if (res.equals("s")) {

                    System.out.println("Qual o nome do seu mamifero?");
                    m1.setNome(sc.nextLine());
                    System.out
                            .println("------------------------------------------------------------------------------");

                    System.out.println("Qual o alimento do seu " + m1.getNome() + "?");
                    m1.setAlimento(sc.nextLine());
                    System.out
                            .println("------------------------------------------------------------------------------");

                    System.out.println("Quantas patas tem o seu " + m1.getNome() + "?");
                    m1.setPatas(Double.parseDouble((sc.nextLine())));
                    System.out
                            .println("------------------------------------------------------------------------------");

                    System.out.println("Qual a regiao do  " + m1.getNome() + "?");
                    m1.setRegiao(sc.nextLine());
                    System.out
                            .println("------------------------------------------------------------------------------");

                    System.out.println("Qual o som do seu " + m1.getNome() + "?");
                    m1.setSom(sc.nextLine());
                    System.out
                            .println("------------------------------------------------------------------------------");

                } else {
                    System.out.println(
                            "você quer add um animal que nao existe ao seu inventario? responda com [s] ou  [n]");
                }

            }else{
                System.out.println("final do programa.");
            }
        }

        System.out.println(m1);

    }
}