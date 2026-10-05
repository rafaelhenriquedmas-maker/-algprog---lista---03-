import java.util.Scanner;

public class somar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Entrada de dados
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double num3 = scanner.nextDouble();

        double maior = Math.max(num1, Math.max(num2, num3));

     
        double menor = Math.min(num1, Math.min(num2, num3));

        double media = (num1 + num2 + num3) / 3;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.printf("Media aritmetica: %.2f\n", media);

        scanner.close();
    }
}