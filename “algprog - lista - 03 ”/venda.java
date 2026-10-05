import java.util.Scanner;

public class venda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        
        System.out.print("Valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        System.out.print("Valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

     
        
        if (valorPago < valorCompra) {
            System.out.println("A quantia paga e insuficiente para realizar a compra.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.printf("Troco: R$ %.2f\n", troco);

            int trocoRestante = (int) troco;

       
            
            int notas50 = trocoRestante / 50;
            trocoRestante %= 50;

            int notas20 = trocoRestante / 20;
            trocoRestante %= 20;

            int notas10 = trocoRestante / 10;
            trocoRestante %= 10;

            int notas5 = trocoRestante / 5;
            trocoRestante %= 5;

            int notas2 = trocoRestante / 2;
            trocoRestante %= 2;

            int notas1 = trocoRestante;

           
            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        scanner.close();
    }
}