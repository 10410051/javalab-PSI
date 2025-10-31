package Atividades.Atividade05.Metodos;

public class PessoaFisica extends Contribuinte{

    public PessoaFisica(String nome, double renda) {
        super(nome, renda);
    }

    @Override
    public double calculaImposto() {
        double renda = getRenda();
        double imposto;

        if (renda <= 1500.00) {

        }
        

        return imposto;
    }
    
}
