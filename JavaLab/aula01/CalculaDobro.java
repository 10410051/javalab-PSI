package JavaLab.aula01;
import java.util.Scanner;

public class CalculaDobro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        int dobro = numero * 2;
        System.out.println("Dobro: " + dobro);

    }
    
}