package JavaLab.aula08;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(1, 1);
        Ponto p2 = new Ponto(3, 3);
        double distancia = p1.distancia(p2);
        Circulo c = new Circulo(p1, 2);
        boolean estaPerto = c.estaContido(p2);
        System.out.printf("Esta perto: %b\n", estaPerto);
        System.out.printf("Distancia: %.2f\n", distancia);
    }
}
