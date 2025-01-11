import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad en años: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Teienes " + edad + " años eres un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Tienes " + edad + " años eres un adolescente");
        } else if (edad >= 18) {
            System.out.println("Tienes " + edad + " años eres un adulto");
        } 
        scanner.close();
    }
}
