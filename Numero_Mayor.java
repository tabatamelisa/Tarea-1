import java.util.Scanner;

public class Numero_Mayor {
    public static void main(String[] args) {
        System.out.print("Calcular cuál de los siguientes números es mayor:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int nummayor = num1; 

        if (num2 > nummayor) {
            nummayor = num2; 
        }

        if (num3 > nummayor) {
            nummayor = num3; 
        }

        System.out.println("El número mayor es: " + nummayor);

        scanner.close();
    }
}
