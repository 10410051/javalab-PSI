package JavaLab.aula02.Exemplo;
import java.util.Scanner;;

public class Orçamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Serviço: ");
        String servico = entrada.nextLine();
        System.out.println("Horas: ");
        int horas = entrada.nextInt();
        System.out.println("Valor por hora: ");
        double valorHora = entrada.nextDouble();
        System.out.println("Nome do Cliente: ");
        String cliente = entrada.nextLine();

        double custo = horas * valorHora;

        String linha = "=".repeat(60);
        System.out.println(linha);
        System.out.println("Orçamento de Serviço\n");
        System.out.println(linha);
        System.out.printf("Cliente: %s\n", cliente);
        System.out.printf("Serviço: %s\n", servico);
        System.out.printf("Horas Estimadas: %d\n", horas);
        System.out.printf("Valor por Hora: %d\n", valorHora);
        System.out.println("-".repeat(40));
        System.out.printf("\nCusto total: R$ %.2f\n", custo);
        System.out.println(linha);
        System.out.println();
        System.out.println("Validade deste orçamento: 7 dias.");
        System.out.println("Obrigado pela preferencia!");
        System.out.println(linha);

        entrada.close();



    }
}
