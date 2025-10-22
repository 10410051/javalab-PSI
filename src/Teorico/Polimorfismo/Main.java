package Teorico.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Forma f1 = new Forma();
        Circulo c1 = new Circulo();
        Quadrado q1 = new Quadrado();

        f1.desenhar();
        c1.desenhar();
        q1.desenhar();

        Forma f2 = new Circulo();
        f2.desenhar();

        Forma formas[] = new Forma[5];
        formas[0] = new Circulo();
        formas[1] = new Circulo();
        formas[2] = new Quadrado();
        
    }
}
