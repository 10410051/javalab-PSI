package JavaLab.aula02.ExerAula02.Exer01;
import java.util.Scanner;

public class Multa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Livro: ");
        String livro = sc.nextLine();
        System.out.printf("\nDias: ");
        int atrasoDias = sc.nextInt();

        double multa = atrasoDias * 1.25;

        String linha = "+" + "-".repeat(20) + "+";
        System.out.println("AVISO DE MULTA - BIBLIOTECA");
        System.out.println(linha);
        System.out.printf("Livro: %s\n", livro);
        System.out.printf("Dias em Atraso: %d\n", atrasoDias);
        System.out.printf("Multa Total: %d\n", multa);
        System.out.println(linha);
        System.out.println("por favor, regularize sua situação");

        sc.close();

    }
}