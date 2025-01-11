import java.util.Scanner;

public class Contraseñas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contraseña1 = "200119";

        System.out.print("Ingresa la contraseña: ");
        String contraseña2 = scanner.nextLine();

        if (contraseña2.equals(contraseña1)) {
            System.out.println("contraseña correcta - Acceso concedido");
        } else {
            System.out.println("Contraseña incorrecta - Acceso bloqueado");
        }

        scanner.close();
    }
}
