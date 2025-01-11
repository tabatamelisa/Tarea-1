public class SumaNumeros {
    public static void main(String[] args) {
        int suma = 0; // Inicializamos la variable para acumular la suma

        // Bucle para sumar números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            suma += i; // Agregamos el número actual a la suma
        }

        // Mostramos la suma total
        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }
}
