// Importaciones necesarias.
package model;

import java.util.Date;

// Creamos la clase AppointmentDoctor que implementa la interface ISchedulable, con sus atributos.
public class AppointmentDoctor implements ISchedulable {
    private int id;
    private Patient patient;
    private model.Doctor doctor;
    private Date date;
    private String time;

    // Getters and Setters de la clase AppointmentDoctor.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
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
    // Es obligatorio utilizar el método schedule() declarado en la interface.
    @Override
    public void schedule(Date date, String time) {

    }
}
