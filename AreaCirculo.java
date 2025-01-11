public class AreaCirculo {
    // Constante para el valor de π
    public static final double PI = 3.14159265359;

    // Función que calcula el área de un círculo dado su radio
    public static double calcularArea(double radio) {
        return PI * radio * radio; // Fórmula del área del círculo
    }

    public static void main(String[] args) {
        double area = calcularArea(3); // Llamamos a la función con un radio
        System.out.println("El área del círculo es: " + area); // Mostramos el área
    }
}
