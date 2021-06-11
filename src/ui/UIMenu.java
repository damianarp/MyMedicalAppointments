// Importaciones
package ui;
import java.util.Scanner;

// Creamos la clase ui.UIMenu con sus atributos y métodos.
public class UIMenu {
    // Métodos
    // Mostramos el menú (Debe ser public para poder ser accedido fuera de su clase y static para poder ser manejado por las demas clases)
    public static void showMenu() {
        System.out.println("\n");
        System.out.println("Welcome to My Appointments");
        System.out.println("Seleccione la opción deseada");

        // Inicializamos la variable respuesta en 0.
        int response = 0;

        // Bucle Do-While para mostrar las opciones.
        do {
            System.out.println("\n");
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Mostramos la respuesta elegida.
            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
            }
        } while(response != 0);
    }

    // Mostramos el menú del paciente
    static void showPatientMenu() {

        // Inicializamos la variable respuesta en 0.
        int response = 0;

        // Bucle Do-While para mostrar las opciones.
        do {
            System.out.println("\n");
            System.out.println("Paciente");
            System.out.println("1. Reserve una cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Volver");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Mostramos la respuesta elegida.
            switch (response) {
                case 1:
                    System.out.println("Reserve una cita");
                    break;
                case 2:
                    System.out.println("Mis citas");
                    break;
                case 0:
                    System.out.println("Gracias por confiar en nosotros.");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción correcta");
            }
        } while(response != 0);
    }
}
