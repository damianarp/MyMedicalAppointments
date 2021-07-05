// Importaciones
package ui;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

// Creamos la clase UIMenu con sus atributos y métodos.
public class UIMenu {

    // Variables estáticas.
    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "September", "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    // Métodos
    // Mostramos el menú (Debe ser public para poder ser accedido fuera de su clase y static para poder ser manejado por las demas clases)
    public static void showMenu() {
        System.out.println("\n");
        System.out.println("Welcome!!");
        System.out.println("Please, select an option");

        // Inicializamos la variable respuesta en 0.
        int response = 0;

        // Bucle Do-While para mostrar las opciones.
        do {
            System.out.println("\n1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Mostramos la respuesta elegida.
            switch (response) {
                case 1:
                    System.out.println("\nAssigned Doctors\n");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thanks for visiting us!!");
                    break;
                default:
                    System.out.println("Please, select an option");
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
            System.out.println("Patient");
            System.out.println("1. Make an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Return");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Mostramos la respuesta elegida.
            switch (response) {
                case 1:
                    System.out.println("Make an Appointment");
                    break;
                case 2:
                    System.out.println("My Appointments");
                    break;
                case 0:
                    System.out.println("Thanks for trusting us.");
                    break;
                default:
                    System.out.println("Please, select an option");
            }
        } while(response != 0);
    }

    // Método que simula una autenticación de usuario. El parámetro que requiere nos dirá que tipo de usuario será quien haga la autenticación.
    private static void authUser(int userType) {
        // userType = 1 -> Doctor
        // userType = 2 -> Patient

        // Creamos una lista de doctores registrados.
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "ale@mail.com"));
        doctors.add(new Doctor("Mariano Fernandez", "mariano@mail.com"));
        doctors.add(new Doctor("Gustavo Rosas", "gustavo@mail.com"));
        doctors.add(new Doctor("Leonel Rodríguez", "leo@mail.com"));

        // Creamos una lista de pacientes registrados.
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Analía Sosa", "analia@mail.com"));
        patients.add(new Patient("Rosa Casas", "rosa@mail.com"));
        patients.add(new Patient("Daniel Colucci", "daniel@mail.com"));
        patients.add(new Patient("Franco Benitez", "franco@mail.com"));

        // Validamos si el email es correcto.
        boolean emailCorrect = false;
        do {
            System.out.println("\nInsert your email: [a@a.com]");

            // Leemos los datos con un Scanner.
            Scanner sc = new Scanner(System.in);

            // Lo recibimos de esta forma.
            String email = sc.nextLine();

            if(userType == 1) {
                // Recorremos la lista de doctores.
                for (Doctor d: doctors) {
                   // Comparamos el mail ingresado con los mails registrados.
                   if(d.getEmail().equals(email)) {
                       emailCorrect = true;
                       // Obtenemos el usuario logueado.
                       doctorLogged = d;
                       // Mostramos el menú del doctor showDoctorMenu().
                       UIDoctorMenu.showDoctorMenu();
                   }
                }
            }

            if(userType == 2) {
                // Recorremos la lista de pacientes.
                for(Patient p: patients) {
                    // Comparamos el mail ingresado con los mails registrados.
                    if(p.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtenemos el usuario logueado.
                        patientLogged = p;
                        // Mostramos el menú del paciente showPatientMenu().
                        showPatientMenu();
                    }
                }
            }
        } while(!emailCorrect);
    }
}
