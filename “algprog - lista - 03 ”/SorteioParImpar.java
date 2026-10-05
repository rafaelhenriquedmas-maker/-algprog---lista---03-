import java.util.Random;
import java.util.Scanner;

public class SorteioParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Digite o primeiro número inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor2 = scanner.nextInt();

        
        int menor = Math.min(valor1, valor2);
        int maior = Math.max(valor1, valor2);

        
        int numeroSorteado = random.nextInt((maior - menor) + 1) + menor;

        
        if (numeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + numeroSorteado + " (Este número é PAR)");
        } else {
            System.out.println("Número sorteado: " + numeroSorteado + " (Este número é ÍMPAR)");
        }

        scanner.close();
    }
}