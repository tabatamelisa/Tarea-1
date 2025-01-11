public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 50:");

        // Recorremos los números del 2 al 50 (el 1 no es primo)
        for (int i = 2; i <= 50; i++) {
            boolean esPrimo = true; // Asumimos que el número es primo

            // Verificamos si es divisible por algún número entre 2 y la raíz cuadrada de i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false; // Si es divisible, no es primo
                    break;
                }
            }

            // Si es primo, lo imprimimos
            if (esPrimo) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(); // Salto de línea final
    }
}
