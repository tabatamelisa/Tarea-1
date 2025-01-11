import java.util.Scanner;

public class Operaciones_Basicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Elige qué operación deseas realizar: (suma, res, mul, div): ");
        char operacion = scanner.next().charAt(0); 

        double respuesta = 0;

        switch (operacion) {
            case '1':
                respuesta = num1 + num2;
                break;
            case '2':
                respuesta = num1 - num2;
                break;
            case '3':
                respuesta = num1 * num2;
                break;
            case '4':
                if (num2 != 0) {
                    respuesta = num1 / num2;
                }
            
                break; 
        }

        System.out.println("La respuesta de la operación es: " + respuesta);

        scanner.close();
    }
}
