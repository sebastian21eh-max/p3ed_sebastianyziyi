// COMENTARIO AÑADIDO (MODIFICACIÓN DEL FICHERO)
// Otro comentario que he añadido

package pruebapersona;
/**
 * Clase Persona
 * Representa una persona con nombre y edad
 */
public class persona {

    // ===== ATRIBUTOS =====
    String nombre;  // Guarda el nombre de la persona
    int edad;       // Guarda la edad de la persona

    // ===== MÉTODOS =====

    /**
     * Método que muestra un saludo
     */
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    /**
     * Método que muestra la edad
     */
    public void mostrarEdad() {
        System.out.println("Tengo " + edad + " años");
    }
}