package revisao1;

public class Animal{


    private String nome;
    private double patas;
    private String regiao;
    private String som;
    private String alimento;

    // #region Getter e setters

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPatas() {
        return patas;
    }

    public void setPatas(double patas) {
        this.patas = patas;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    // #endregion


    @Override
    public String toString() {
        return "eu sou :" + getNome()+ ", sou encontrado no : " + getRegiao()+", me alimento de: " + getAlimento()+ ", emito esse som :" + getSom();


}
}
