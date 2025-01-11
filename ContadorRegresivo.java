public class ContadorRegresivo {
    public static void main(String[] args) {
        // Bucle para contar de 10 a 1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i); // Imprime el número actual
            if (i > 1) {
                System.out.print(", "); // Agregar coma entre los números
            }
        }
        System.out.println(); // Salto de línea final
    }
}
