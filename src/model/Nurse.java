// Importaciones necesarias.
package model;

// Creamos la clase Nurse que hereda de la clase User, con sus atributos.
public class Nurse extends User {
    private String speciality;

    // Constructor de la clase Nurse.
    public Nurse (String name, String email) {
        super(name,email);
    }

    //Getters and Setters de la clase Nurse.
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Es obligatorio implementar el método showDataUser() de la clase abstracta User, porque fue declarado como abstracto en la clase padre y se tiene que usar si o si en las clases hijas.
    @Override
    public void showDataUser() {
        System.out.println("Hospital: Berhayat");
        System.out.println("Departamento: Pediatría, Oncología, Neurología");
    }
}
