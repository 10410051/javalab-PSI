package aula03.Exer03;
import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdeDias;

        do {
            System.out.printf("Quantidade de dias: ");
            qtdeDias = sc.nextInt();
            if (qtdeDias <= 0) {
                System.out.println("Insira uma quantidade de dias maior que 0");
            }
        } while (qtdeDias <= 0);

        double valorVendas;
        int totalValor = 0;
        for (int i = 1; i <= qtdeDias; i++) {
            System.out.printf("Valor da venda no dia: ");
            valorVendas = sc.nextFloat();
            totalValor += valorVendas;

            if (valorVendas >= totalValor) {
                System.out.println("");
            }
            

        }
    }
}
