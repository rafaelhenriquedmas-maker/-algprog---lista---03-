import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        final double PI = 3.141592;

        // Entrada dos dados
        System.out.print("Digite o código da operação (1, 2 ou 3): ");

        System.out.print("Digite o valor do raio (r): ");
        double raio = scanner.nextDouble();

        
        switch (operacao) {
            case 1:
                
                double perimetro = 2 * PI * raio;
                System.out.printf("Perímetro do círculo: %.4f\n", perimetro);
                break;

            case 2:
                
                double area = PI * Math.pow(raio, 2);
                System.out.printf("Área do círculo: %.4f\n", area);
                break;

            case 3:
                
                double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
                System.out.printf("Volume da esfera: %.4f\n", volume);
                break;

            default:
                
                System.out.println("Erro: Código de operação inválido.");
                break;
        }

        scanner.close();
    }
}