// Creamos la clase Doctor con sus atributos y métodos.
public class Doctor {
    static int id = 0; // Debe ser static para poder llevar el control del Autoincrement. La inicializamos en 0 y la hacemos incrementable en el Constructor.
    String name;
    String speciality;

    // Método Constructor
    /**
     * Incrementa el id.
     * */
    Doctor() {
        id++; // Incrementamos el id.
    }

    // Métodos
    /**
     * Descripción: Imprime el nombre del Doctor
     * @return void
     * */
    public void showName(){
        System.out.println("Name Doctor: " + name);
    }

    /**
     * Descripción: Imprime el ID del Doctor
     * @return void
     * */
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
