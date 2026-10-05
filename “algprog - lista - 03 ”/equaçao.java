import java.util.Scanner;

public class equaçao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();

        
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } 
       
        else if (a == 0 && b != 0) {
            System.out.println("Essa e uma equacao de primeiro grau");
            double raiz = -c / b;
            System.out.printf("Raiz real: %.2f\n", raiz);
        } 
       
        else {
          
            double delta = (b * b) - (4 * a * c);

          
            if (delta < 0) {
                System.out.println("Esta equacao nao possui raizes reais");
            } 
            
            else if (delta == 0) {
                System.out.println("Esta equacao possui duas raizes reais iguais.");
                double x = -b / (2 * a);
                System.out.printf("Valor das raizes (x1 = x2): %.2f\n", x);
            } 
            
            else {
                System.out.println("Esta equacao possui duas raizes reais diferentes.");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Raiz x1: %.2f\n", x1);
                System.out.printf("Raiz x2: %.2f\n", x2);
            }
        }

        scanner.close();
    }
}