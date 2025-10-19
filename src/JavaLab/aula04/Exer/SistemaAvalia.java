package JavaLab.aula04.Exer;
import java.util.Scanner;

public class SistemaAvalia {
    
    public static double calcularMediaTurma(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
    
    public static void imprimirResultados(double[] notas) {
        System.out.println("\n=== RESULTADOS DA TURMA ===");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Estudante " + (i + 1) + " - Nota: " + notas[i] + " - ");
            
            if (notas[i] >= 7.0) {
                System.out.println("APROVADO");
            } else {
                System.out.println("RECUPERAÇÃO");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de estudantes: ");
        int numEstudantes = scanner.nextInt();
        
        double[] notas = new double[numEstudantes];
        
        System.out.println("\nDigite as notas dos estudantes:");
        for (int i = 0; i < numEstudantes; i++) {
            System.out.print("Nota do estudante " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
                notas[i] = scanner.nextDouble();
            }
        }
        
        double mediaTurma = calcularMediaTurma(notas);
        System.out.println("\nMédia da turma: " + String.format("%.2f", mediaTurma));
        
        imprimirResultados(notas);
        
        scanner.close();
    }
}