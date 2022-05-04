package aula5;

import java.util.Scanner;

public class programa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        aluno a1 = new aluno();
        professor p1 = new professor();

        p1.setNome("almir carrasco");
        p1.setEndereco("rua desem. loopes gama, 458a");
        p1.setCpf("888.930.674-20");
        p1.setNomeCurso("java spring");
        p1.setSalario(45.6);
        p1.setTelefone("(254) 98569-9855");

        a1.setNome("luizito suares");
        a1.setEndereco("rua desem. loopes gama, 458a");
        a1.setCpf("777.930.674-20");
        a1.setCurso("java spring");
        a1.setTelefone("(254) 98569-9855");
        double[] notas={7,5,4,4};
        a1.setNotas(notas);

        System.out.println(a1.montaBoletim());

 //#region
//         // System.out.println("Abasteça com informações do aluno");

//         // System.out.println("Nome do aluno:");
//         // a1.setNome(entrada.nextLine());
//         // System.out.println("Endereço:");
//         // a1.setEndereco(entrada.nextLine());
//         // System.out.println("telefone:");
//         // a1.setTelefone(entrada.nextLine());
//         // System.out.println("Cpf:");
//         // a1.setCpf(entrada.nextLine());
//         // System.out.println("Curso:");
//         // a1.setCurso(entrada.nextLine());
 //#endregion
//         System.out.println("-------------------------------");
//         System.out.println("-------------------------------");

//         System.out.println("nome do professor : " + p1.getNome());
//         System.out.println(p1.montaHolerite());

//         System.out.println("-------------------------------");
//         System.out.println("-------------------------------");

//         System.out.println("nome do Aluno : " + a1.getNome());
//         System.out.println("endereço do Aluno : " + a1.getEndereco());
    }
}
