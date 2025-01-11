import java.util.Scanner;

public class Positivo_Negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número para verificar si es positivo o negativo: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println( numero + " es un número positivo");
        } else if (numero < 0) {
            System.out.println( numero + " es un número negativo");
        } else {
            System.out.println( "El número es cero");
        }

        scanner.close();
    }
}
