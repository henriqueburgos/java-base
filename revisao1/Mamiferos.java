package revisao1;

public class Mamiferos extends Animal {

    public String emitirSom() {
        return " esse é o som que o " + getNome() + "faz : " + getSom();
        
    }

    public String comer() {
        return "estou comendo meu " + getAlimento();
    }

    public String dormir(){
        return "estou dormindo!";
    }

    
    }

    
