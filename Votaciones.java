import java.util.Scanner;

public class Votaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad en años: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {  
        System.out.printf("Usted tiene la edad para votar");
        } else if (edad < 18) {
        System.out.printf("Usted no tiene la edad para votar");
     
        }
        scanner.close();
    }
}
