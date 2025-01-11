public class ImprimirNumeros {
    public static void main(String[] args) {
        // Bucle para imprimir números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i); // Imprime el número actual
            if (i < 10) {
                System.out.print(", "); // Agrega una coma entre los números
            }
        }
        System.out.println(); // Salto de línea final
    }
}
