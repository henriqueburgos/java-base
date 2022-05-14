package aula7;// arquitetura Estruturada , de iterligação , estruturas de classes pode ser atributos de classes.

public class Data {
   
  
    private int dia;
    private int mes;
    private int ano;
    private DiasSemana diaSemana;

    //#region Construtores


    //#endregion
    public Data(int dia,int mes, int ano,DiasSemana diasSemana){
        super();
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diasSemana;
    }
    public Data(){
        super();
    }
    
    //#region  Getter e Setters
 
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public DiasSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiasSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    //#endregion

}
