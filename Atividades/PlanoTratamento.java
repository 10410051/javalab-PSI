package Atividades;

import java.util.ArrayList;

public class PlanoTratamento {
    ArrayList<Atendimento> atendimento;
    
    public PlanoTratamento() {
        atendimento = new ArrayList<Atendimento>();
    }

    public void adicionaAtendimento(Atendimento a) {
        atendimento.add(a);
    }




}
