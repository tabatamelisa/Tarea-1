public class SaludoPersonalizado {
    // Función que recibe un nombre y retorna un saludo
    public static String saludar(String nombre) {
        return "Hola, " + nombre + "!";
    }

    public static void main(String[] args) {
        String saludo = saludar("María"); // Llamamos a la función con un ejemplo
        System.out.println(saludo); // Mostramos el saludo
    }
}
