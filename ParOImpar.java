public class ParOImpar {
    // Función que verifica si un número es par o impar
    public static boolean esPar(int numero) {
        return numero % 2 == 0; // Retorna true si es par, false si es impar
    }

    public static void main(String[] args) {
        int numero = 4; // Número a verificar
        System.out.println("¿Es par? " + esPar(numero)); // Mostramos el resultado
    }
}
