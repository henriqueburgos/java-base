package aula8;

import javax.annotation.processing.Processor;

public class servicePoint {
    public static void main(String[] args) {
       
        Pessoa pessoaFisica = new Pessoa();
        Pessoa pessoaFisica1 = new Pessoa();
        
        pessoaFisica1.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoaFisica1.setNumeroDocumento(pessoaFisica1.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pessoaFisica1);
        System.out.println("---------------------------");
        pessoaFisica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoaFisica.setNumeroDocumento(pessoaFisica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pessoaFisica);

        Pessoa pessoaJuridica = new Pessoa();

        pessoaJuridica.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pessoaJuridica.setNumeroDocumento(pessoaJuridica.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pessoaJuridica);
    }
}