package JavaLab.aula03.Exemplo;
import java.util.Scanner;

public class Curtidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroPublicacoes;
        do {
            System.out.printf("Numero de publicações: ");
            numeroPublicacoes = sc.nextInt();
            if (numeroPublicacoes <= 0) {
                System.out.println("O numero de publicações deve ser um valor positivo.");
            }
        } while (numeroPublicacoes <= 0);

        int totalCurtidas = 0; // variavel acumuladora
        for (int i = 1; i <= numeroPublicacoes; i++) {
            System.out.printf("Quantidade de curtidas: #%02d", i);
            int qtdeCurtidas = sc.nextInt();
            totalCurtidas += qtdeCurtidas; 
            if (qtdeCurtidas >= 100) {
                System.out.println("\tPublicação popular!");
            }
            else {
                System.out.println("\tPublicações com poucas curtidas!");
            }
        }
        double mediaCurtidas = (double) totalCurtidas / numeroPublicacoes;
        System.out.printf("Numero de publicações: %d\n", totalCurtidas);
        System.out.printf("Total de curtidas: %d\n", totalCurtidas);
        System.out.printf("Media de Curtidas: %.2f\n", mediaCurtidas);
    }
}