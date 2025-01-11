import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Bucle para generar la tabla del 1 al 10
        for (int i = 1; i <= 10; i++) {
            // Mostrar el resultado de la multiplicación
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
