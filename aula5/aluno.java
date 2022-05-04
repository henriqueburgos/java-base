package aula5;

public class aluno extends Pessoas {

    private String curso;
    private double[] notas;

    // #region Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    // #endregion

    // #region Regras de negocio

    private double calculaMedia() {
        double somasNota = 0;
        int qtdNotas = this.notas.length;
        for (int d = 0; d < this.notas.length; d++) {
            somasNota += this.notas[d];
        }

        return somasNota / qtdNotas;
    }

    private boolean verificaAprovacao() {
        double media = this.calculaMedia();
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public String montaBoletim() {
        String boletim = "nome do aluno: " + super.getNome() +System.lineSeparator();
        if (this.verificaAprovacao() == false) {
            boletim += (System.lineSeparator() + " devido a politcas de academia, o boletim está indisponivel")+System.lineSeparator();
        }else{
            boletim+=("cpf : " +super.getCpf()+System.lineSeparator());
            for (int i = 0; i < notas.length; i++) {
                boletim+= (i+1)+" avaliação: " + this.notas[i]+ " | " +System.lineSeparator();

                boletim+=("resultado aprovado")+System.lineSeparator();
            }
        }
        return boletim;
    }

    // #endregion

}
