package aula5;
import java.lang.Math;

public class professor extends Pessoas {

    private double salario;
    private String nomeCurso;

    // #region GETTERS E SETTERS
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    // #endregion

    // #region Regras de negocio
    public double calcularSalario() {

        return Math.round((this.salario * 44) * (4.5));
    }

    public String montaHolerite() {
        String holerite;
        holerite = "Nome do funcionario: " + super.getNome();
        holerite += " | Cpf do funcionario: " + super.getCpf();
        holerite += (" | valor salario: " + this.calcularSalario());
        holerite += (" | Valor hora: " + this.salario);
        holerite += (" | Curso referente: " + this.nomeCurso);

        return holerite;
    }

    // #endregion

}
// para usar atributos que nao são declarados na classe vou ter que chamar esses
// atributos mediante ao comando super - indica que chama o componente da classe
// base