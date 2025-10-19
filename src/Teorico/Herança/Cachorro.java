package Teorico.Herança;

public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(this.nome + "esta latindo");
    }

    @Override
    public String toString() {
        return "Cachorro[nome=" + this.nome + "]";
    }
}
