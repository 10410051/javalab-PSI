package Atividades;

import java.util.ArrayList;

public class PlanoTratamento {
    ArrayList<Atendimento> atendimentos;
    
    public PlanoTratamento() {
        atendimentos = new ArrayList<Atendimento>();
    }

    public void adicionaAtendimento(Atendimento a) {
        atendimentos.add(a);
    }

    public int calculaTempoTotal() {
        int tempoTotal = 0;

        for (Atendimento a : atendimentos) {
            tempoTotal += a.calculaTempo();
        }

        return tempoTotal;
    }

    public double calculaCustoTotal() {
        double custoTotal = 0.0;

        for (Atendimento a : atendimentos) {
            custoTotal += a.calculaCusto();
        }

        return custoTotal;
    }

}
