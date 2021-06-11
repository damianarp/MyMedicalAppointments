// Importaciones
import static ui.UIMenu.*; // Debe ser static para poder ser utilizado.

// Creamos la clase Main, es la clase que sirve como punto de entrada de la app.
public class Main {
    public static void main(String[] args) {

        // Declaramos e instanciamos un objeto de la clase Doctor.
        // Primero, tipo de objeto (nombre de la clase a la cual pertenece el objeto).
        // Segundo, nombre del objeto.
        // Instanciamos usando el keyword new + Método Constructor, con el valor de su parámetro.
        Doctor myDoctor = new Doctor();

        // Le asignamos un nombre al doctor.
        // Accesamos al nombre a traves del atributo.
        myDoctor.name = "Alejandro López";

        // Mostramos el nombre del Doctor accesando a través del método creado en la clase Doctor.
        myDoctor.showName(); // Name: Alejandro López

        // Mostramos el id del Doctor accesando a través del método creado en la clase Doctor.
        myDoctor.showId(); // Id: 1

        // Instanciamos otro objeto de la clase Doctor.
        Doctor myDoctorAnn = new Doctor();

        // Accedemos al nombre a traves del atributo.
        myDoctorAnn.name = "Annie Brown";

        // Mostramos el nombre del Doctor accesando a través del método creado en la clase Doctor.
        myDoctorAnn.showName(); // Name: Annie Brown

        // Mostramos el id del Doctor accesando a través del método creado en la clase Doctor.
        myDoctorAnn.showId(); // Id: 2

        // Mostramos el Menú, el cual esta siendo accedido desde el import del package ui.UIMenu.
        showMenu();
    }
}
