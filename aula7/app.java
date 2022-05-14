package aula7;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("----------------------- CONSTANTES ATRIBUIDAS -----------------------");
        int dia = DiaSemana.SEGUNDA;
        System.out.println(dia);

        System.out.println("----------------------- ENUM ATRIBUIDOS--------------------");

        DiasSemana dEnumm = DiasSemana.DOMINGO;
        System.out.println(dEnumm.toString() + " - " + dEnumm.getValor());

        System.out.println("----------------------- CLASSES ATRIBUIDAS----------------------");

        Data dataPrincipal = new Data(1, 5, 2022, DiasSemana.SEXTA);

        System.out.println(dataPrincipal.getDiaSemana());

        System.out.println("----------------------- CLASSES ATRIBUIDAS----------------------");

        DiasSemana[] diasVetor = DiasSemana.values();

        for (int i = 0; i < diasVetor.length; i++) {
            System.out.println(diasVetor[i]);
            if (diasVetor[i].getValor() == dataPrincipal.getDiaSemana().getValor()) {
                System.out.println("foi esse dia");
            } else {
                System.out.println("não foi esse dia.");
            }

        }

        for (DiasSemana diarapido : DiasSemana.values()) {
            if (diarapido.getValor() == dataPrincipal.getDiaSemana().getValor()) {
                System.out.println("o dia rapido é " + diarapido);
            } else {
                System.out.println(diarapido+ " nao é o dia");
            }
        }

    }

}
