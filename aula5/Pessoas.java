package aula5;

public class Pessoas {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    // #region Encapesulamento de atributos [ Getter e Setters]
    // -------------------- NOME-------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // -------------------- CPF --------------------------------------
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    // ------------------------- Endereco ----------------------------
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // ----------------------- telefone -----------------------------
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // #endregion

}
