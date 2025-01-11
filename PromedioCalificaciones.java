import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0; // Suma total de las calificaciones
        int contador = 0; // Número de calificaciones ingresadas

        System.out.println("Ingresa calificaciones (escribe -1 para terminar):");

        while (true) {
            int calificacion = scanner.nextInt();

            // Verificamos si el usuario desea terminar
            if (calificacion == -1) {
                break;
            }

            suma += calificacion; // Agregamos la calificación a la suma
            contador++; // Incrementamos el contador
        }

        // Calculamos y mostramos el promedio si hay calificaciones ingresadas
        if (contador > 0) {
            double promedio = (double) suma / contador; // Convertimos para obtener un resultado decimal
            System.out.println("El promedio de las calificaciones es: " + promedio);
        } else {
            System.out.println("No ingresaste ninguna calificación.");
        }
    }
}
