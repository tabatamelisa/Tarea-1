import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1; // Inicializamos el factorial en 1

        // Calculamos el factorial con un bucle
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Multiplicamos el factorial acumulado por i
        }

        // Mostramos el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

