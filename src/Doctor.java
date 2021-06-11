// Creamos la clase Doctor y sus atributos.
public class Doctor {
    int id;
    String name;
    String speciality;

    // Método Constructor
    /**
     * Imprime el nombre del Doctor asignado
     * @param name Nombre del Doctor.
     * */
    Doctor(String name) {
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    // Comportamientos
    /**
     * Descripción: Imprime el nombre del Doctor
     * @return void
     * */
    public void showName(){
        System.out.println("Name: " + name);
    }
}
