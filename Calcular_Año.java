import java.util.Scanner;

public class Calcular_Año {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un año para calcular si fue o será bisisesto: ");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("Año bisiesto");
        } else {
            System.out.println("Año no bisiesto");
        }

        scanner.close();
    }
}
