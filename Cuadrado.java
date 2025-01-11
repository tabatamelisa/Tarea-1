public class Cuadrado {
    // Función que calcula el cuadrado de un número
    public static int calcularCuadrado(int numero) {
        return numero * numero; // Multiplicamos el número por sí mismo
    }

    public static void main(String[] args) {
        int resultado = calcularCuadrado(5); // Llamamos a la función con un número
        System.out.println("El cuadrado es: " + resultado); // Mostramos el resultado
    }
}
