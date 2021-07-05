// Importaciones necesarias.
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// Creamos la clase Doctor que hereda de la clase User, con sus atributos y métodos.
public class Doctor extends User {
    private String speciality;
    // Creamos un objeto del tipo ArrayList para listar las citas agendadas.
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Método Constructor
    public Doctor(String name, String email) {
        super(name,email);
        System.out.println("Dr. " + name);
    }

    // Método para agendar citas.
    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    // Retornamos la lista de citas a través de su getter.
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // Getters and Setters de la clase Doctor.
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Sobreescribimos el método toString que se hereda de la clase Object para modificar su contenido y usarlo luego.
    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\n\nAvailable Appointments\n" + availableAppointments.toString();
    }

    // Es obligatorio implementar el método showDataUser() de la clase abstracta User, porque fue declarado como abstracto en la clase padre y se tiene que usar si o si en las clases hijas.
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Berhayat");
        System.out.println("Departamento: Cirugía");
    }

    // Creamos la clase anidada AvailableAppointment con la cual se agendaran las citas.
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // Formateamos la fecha.

        // Constructor de la clase AvailableAppointment.
        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date); // En esta línea podría ocurrir un error. Para evitar que el flujo del programa se interrumpa, capturamos una excepción.
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        // Getters and Setters de la clase AvailableAppointment.
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        // Para mostrar la fecha, sobrecargamos el método getDate para formatearlo a String.
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        // Sobreescribimos el método toString que se hereda de la clase Object para modificar su contenido y utilizarlo luego.
        @Override
        public String toString() {
            return "\nDate: " + date + ", Time: " + time;
        }
    }
}
