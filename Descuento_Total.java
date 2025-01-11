import java.util.Scanner;

public class Descuento_Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: $");
        double pago = scanner.nextDouble();

        if (pago > 100) {
            pago = pago - (pago * 20/100);  
        System.out.printf("¡FELICIDADES! el monto de la compra aplica a un descuento del 20 porciento, total a pagar: " + pago);
        } else if (pago <= 100) {
        System.out.printf("¡LO SENTIMOS! tu compra no aplica para un descuento. Total a cancelar: " + pago);
     
        }
        scanner.close();
    }
}

