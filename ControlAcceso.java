import java.util.Scanner;

public class ControlAcceso {
    public static void main(String[] args) {
        final String USUARIO_CORRECTO = "admin";
        final String CONTRASEÑA_CORRECTA = "1234";
        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < 3 && !accesoConcedido) {
            System.out.print("Ingresa tu nombre de usuario: ");
            String usuario = scanner.next();
            System.out.print("Ingresa tu contraseña: ");
            String contraseña = scanner.next();

            if (usuario.equals(USUARIO_CORRECTO) && contraseña.equals(CONTRASEÑA_CORRECTA)) {
                System.out.println("Bienvenido, " + usuario + ".");
                accesoConcedido = true;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
                }
            }
        }

        if (!accesoConcedido) {
            System.out.println("Acceso bloqueado. Has excedido el número de intentos.");
        }
    }
}
