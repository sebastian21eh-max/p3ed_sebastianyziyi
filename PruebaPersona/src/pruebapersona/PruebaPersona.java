package pruebapersona;

/**
 * Clase principal
 * Aquí se ejecuta el programa
 */
public class PruebaPersona {

    /**
     * Método main
     * Es el punto de inicio del programa
     */
    public static void main(String[] args) {

        // ===== CREACIÓN DEL OBJETO =====
        persona p1 = new persona(); // Se crea un objeto de tipo Persona

        // ===== ASIGNACIÓN DE VALORES =====
        p1.nombre = "Ana";
        p1.edad = 20;

        // ===== LLAMADA A MÉTODOS =====
        p1.saludar();
        p1.mostrarEdad();
    }
}