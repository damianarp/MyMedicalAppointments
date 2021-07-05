// Importaciones necesarias.
package ui;

import model.Doctor;

import java.util.*;

// Creamos la clase UIDoctorMenu con sus métodos públicos y estáticos.
public class UIPatientMenu {

    // Método para el menú del Paciente.
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\nWelcome " + UIMenu.patientLogged.getName() + "!");
            System.out.println("1. Book an Appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Mostramos la respuesta elegida.
            switch (response) {
                case 1:

                    break;
                case 2:
                    System.out.println("My Appointments");
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Please, select an option");
            }
        }while (response != 0);
    }

    // Método para mostrar el menú de agregar citas.
    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Book an Appointment");
            System.out.println("Select Date:\n");

            // Mapeamos las fechas de los doctores que dejaron fechas disponibles utilizando un Map.
            // El K (key) de la colección Map va a ser de tipo Integer (no puede ser int, ya que Map es una colección de objetos) y va a corresponder al índice de la lista de doctores con fechas disponibles.
            // El V (value) va a ser otro Map que va a contener como K un Integer (el índice de la fecha que seleccione el paciente) y como V un objeto Doctor que va a ser el row completo de doctor, o sea cada doctor con todas sus fechas disponibles.
            // Lo asignamos a un TreeMap<> porque tiene una estructura de árbol.
            // La estructura quedaría así:
            // [doctors]
                // 1. doctor1
                    // 1. fecha1
                    // 2. fecha2
                // 2. doctor2
                    // 1. fecha1
                    // 2. fecha2
                // 3. doctor3
                    // 1. fecha1
            Map<Integer,Map<Integer, Doctor>> doctors = new TreeMap<>();

            // Creamos una variable en la que su scope pueda ser más alto que el de la lista de doctores y que el de la lista de fechas (por el hecho de tener for anidados).
            // La incrementamos en el for anidado, donde se despliega la lista de fechas de todos los doctores.
            int k = 0;

            // Recorremos la lista de doctores 'doctorsAvailableAppointments' con fechas disponibles para extraer sus citas.
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                // Creamos un ArrayList de la clase anidada AvailableAppointment de la clase Doctor, accedemos al doctor que tiene las citas disponibles con el método get(i), y luego con el método getAvailableAppointments() accedemos a las citas.
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                // Creamos un nuevo Map para mapear las fechas.
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                
                // Recorremos las fechas. Capturamos el indice de los doctores para luego insertarlos en el Integer del primer Map.
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    // Imprimimos las fechas.
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    // Capturamos el indice de la fecha y el objeto Doctor de la fecha seleccionada y lo insertamos en el segundo Map con el método put().
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    // Capturamos el indice del objeto Doctor y lo insertamos en el primer Map con el método put().
                    doctors.put(Integer.valueOf(k),doctorAppointments);
                }
            }

            // Una vez obtenida la fecha seleccionada, escaneamos la respuesta introducida para saber que Doctor mostrarle al paciente.
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

        }while(response != 0);
    }

}
