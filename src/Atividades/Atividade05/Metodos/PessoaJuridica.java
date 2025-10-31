package Atividades.Atividade05.Metodos;

public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        double renda = getRenda();
        double imposto = renda * 0.1;

        return imposto;
    }
    
}
