import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite un número para saber si es par o impar: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println( numero + " es un número par");
        } else {
            System.out.println( numero + " es un número impar");
        }

        scanner.close();
    }
}