import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        int invertido = 0; // Inicializamos el número invertido en 0

        // Invertimos el número
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10; // Tomamos el último dígito y lo agregamos al invertido
            numero /= 10; // Eliminamos el último dígito
        }

        // Mostramos el resultado
        System.out.println("El número invertido es: " + invertido);
    }
}
