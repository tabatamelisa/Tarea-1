import java.util.Scanner;

public class Definir_Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número entero: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println( numero + " es mayor que 10");
        } else if (numero < 10) {
            System.out.println( numero + " es menor que 10");
        } else {
            System.out.println( "El número ingresado es igual a 10");
        }

        scanner.close();
    }
}
