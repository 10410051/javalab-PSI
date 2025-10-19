package Atividades.Metodos;

public class Atendimento {
    private int quantidade;
    private Procedimento procedimento;

    public Atendimento(Procedimento p, int qtd) {
        this.procedimento = p;
        this.quantidade = qtd;
    }

    public int calculaTempo() {
        return procedimento.getDuracaoMinutos() * quantidade;
    }

    public double calculaCusto() {
        return procedimento.getPrecoPorSessao() * quantidade;
    }
    
}
