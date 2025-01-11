import java.util.Scanner;

public class Aprobado_Reprobado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación del estudiante para saver si aprueba o reprueba: ");
        float promedio = scanner.nextFloat();

        if (promedio >= 7) {
            System.out.println( "Su calificación es " + promedio + ", está aprobado");
        } else if (promedio < 7) {
            System.out.println( "Su calificación es " + promedio + ", está reprobadp");
        }

        scanner.close();
    }
}