package aula1;

public class imprimeidade {

    public static void main(String[] args) {
        int idade = 24;
        String nome = "Henrique Burgos";
        double peso = 88;
        double altura = 1.82;
        double imc = (peso) / (altura * altura);

        if (idade >= 40) {
            
            if (imc < 22) {
                System.out.println("imc " + imc + " subntrido");
            } else if (imc < 30) {
                System.out.println("Parabéns voce está no peso ideal seu imc é " + imc);
            } else if (imc < 35) {
                System.out.println("você está na classificação de sobrepeso cuidado!! seu imc é " + imc);
            } else {
                System.out.println("você precisa de acompanhamento, sua classificação é obesidade e seu imc é " + imc);
            }
        } else if (imc < 25) {
            System.out.println("voce está subnutrido procure um nutricionista. seu imc é " + imc);
        } else if (imc < 35) {
            System.out.println("parabéns voce está no controle do seu imc e ele é " + imc);
        } else {
            System.out.println("voce precisa fazer mais exercicios seu imc é " + imc);
        }

    }
}
