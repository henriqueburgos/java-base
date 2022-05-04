package aula4;

import java.lang.Math;

// DENTRO DAS CLASSES NAO PODE TER INTERAÇÃO COM O USUARIO 
public class Carro {
    // #region Atributos da classe
    String marca;
    String modelo;

    int numPassageiro;
    double capCombus;
    double consCombus;
    // #endregion

    // #region Regras de negocios da classe metodos
    public double calculaAutonomia() {
        return Math.round(this.capCombus * this.consCombus);
    }

    public double verificaEcoDesempenho(double indice) {
        double eco = this.calculaAutonomia() / this.numPassageiro;
        return eco;

    }

    public boolean EcoDesempenho(double indice) {
        double eco = this.calculaAutonomia();
        if (eco >= indice) {
            return false;
        } else {
            return true;
        }

    }

    // #endregion
}
