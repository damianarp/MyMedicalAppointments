// Creamos la clase Main, es la clase que sirve como punto de entrada de la app.
public class Main {
    public static void main(String[] args) {

        // Declaramos e instanciamos un objeto de la clase Doctor.
        // Primero, tipo de objeto (nombre de la clase a la cual pertenece el objeto).
        // Segundo, nombre del objeto.
        // Instanciamos usando el keyword new + Método Constructor, con el valor de su parámetro.
        Doctor myDoctor = new Doctor("Alejandro López");

        // Le asignamos un nombre al doctor.
        // Accedemos al nombre a traves del atributo.
        myDoctor.name = "Alejandro López";

        // Mostramos el nombre a través del método creado en la clase Doctor.
        myDoctor.showName(); // Name: Alejandro López
    }
}
