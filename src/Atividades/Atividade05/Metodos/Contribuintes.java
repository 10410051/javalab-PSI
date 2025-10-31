package Atividades.Atividade05.Metodos;

import java.util.ArrayList;

public class Contribuintes {
    ArrayList<Contribuinte> contribuintes;
    
    
    
    public Contribuintes() {
        contribuintes = new ArrayList<Contribuinte>();
    }
    
    public void adicionaContribuintes(Contribuinte c) {
        contribuintes.add(c);
    }

    public void apresentaContribuintes() {
        for (Contribuinte c : contribuintes) {
            System.out.println(c);
        }
    }

    
}
