// Importaciones necesarias.
package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

// Creamos la clase UIDoctorMenu con sus métodos públicos y estáticos.
public class UIDoctorMenu {

    // Declaramos una variable estática como lista de doctores con citas agendadas para ser usada en el método checkDoctorAvailableAppointments().
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    // Método para el menú del Doctor
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\nWelcome Dr. " + UIMenu.doctorLogged.getName() + "!");
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointments");
            System.out.println("0. Logout");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Mostramos la respuesta elegida.
            switch (response) {
                case 1:
                    showAddAvailableAppointmentsMenu();
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
    public static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println("Select a Month\n");

            // Recorremos el arreglo de meses. De acuerdo a la lógica, van a ser los primeros 3 meses siempre.
            for (int i = 0; i < 3; i++) {
                // Definimos una variable auxiliar y temporal (para que no altere el ciclo del for) para mostrar la numeración de los meses.
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return\n");

            // Escaneamos la respuesta introducida.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Si los meses seleccionados van del 1 al 3, mostramos el mes seleccionado. Si la opcion elegida es 0, regresamos al menú del doctor.
            if(response > 0 && response < 4){
                // 1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + ". " + UIMenu.MONTHS[monthSelected-1]);

                // Mostramos las opciones del siguiente menú.
                System.out.println("Insert the date available: [dd/mm/yyyy]");

                // Recibimos la fecha reutilizando el objeto 'sc' del tipo Scanner que, como se encuentra dentro del scope, se puede seguir usando.
                String date = sc.nextLine();

                // Mostramos una confirmación al usuario.
                System.out.println("\nYour date is: " + date + "\n1. Correct \n2. Change Date");

                // Recibimos la respuesta, la parseamos a Integer y la guardamos en la variable responseData.
                int responseData = Integer.valueOf(sc.nextLine());

                // Validamos la respuesta. Si es 2, el ciclo no termina y se reinicia (usamos la keyword 'continue'). Caso contrario continua el ciclo.
                if(responseData == 2) continue;

                // Preparamos la lógica para preguntar la hora de la cita.
                int responseTime = 0;
                String time = "";

                // Mientras la respuesta sea 2, se mostrara la logica del 'do'. Si es 1 se sale del ciclo y continua el programa.
                do {
                    // Mostramos las opciones del siguiente menú.
                    System.out.println("\nInsert the time available for date: " + date + " [16:00]");
                    // Recibimos la hora.
                    time = sc.nextLine();
                    // Mostramos una confirmación al usuario.
                    System.out.println("\nYour time is: " + time+ "\n1. Correct \n2. Change Time");
                    // Recibimos la respuesta, la parseamos a Integer y la guardamos en la variable responseTime.
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime == 2);

                // Asignamos al doctor la cita disponible.
                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                // Agregamos al doctor a la lista de doctores con citas agendadas.
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            }else if(response == 0){
                showDoctorMenu();
            }
        }while (response != 0 );
    }

    // Método para agregar al doctor (con citas agendadas) a la lista de doctores con citas agendadas.
    private static  void checkDoctorAvailableAppointments(Doctor doctor) {
        // Si el doctor tiene citas agendadas y además ese doctor no existe dentro de la lista de doctores, lo añadimos dentro de la lista.
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor) ) {
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
