package JavaLab.aula03.Exer03;
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

        double totalVendas = 0;
        double maiorVenda = 0;
        int diaMaiorVenda = 0;

        for (int i = 1; i <= qtdeDias; i++) {
            double venda;
            do {
                System.out.println("Valor: ");
                venda = sc.nextDouble();

                if (venda < 0) {
                    System.out.println("Valor invalido!");
                }
            } while (venda < 0);

            totalVendas += venda;

            if (venda > maiorVenda) {
                maiorVenda = venda;
                diaMaiorVenda = i;
            }
        }

        double mediaVendas = totalVendas / qtdeDias;

        System.out.println("\n===== RELATORIO DE VENDAS =====");
        System.out.println("Total de vendas: R$" + totalVendas);
        System.out.println("Media de vendas diarias: " + mediaVendas);
        System.out.println("Maior venda foi no dia" + diaMaiorVenda + "com valor de R$" + maiorVenda);

        sc.close();
            

        
    }
}
