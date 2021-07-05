// Importaciones necesarias.
package model;

// Creamos la clase Patient que hereda de la clase User, agregamos sus atributos.
public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    // Constructor de la clase Patient y sus atributos.
    public Patient (String name, String email) {
        super(name, email);
    }

    // Getters and Setters de la clase Patient.
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Casteamos de double a String para poder agregarle texto (Kg) al peso.
    public String getWeight() {
        return this.weight + " Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Casteamos de double a String para poder agregarle texto (mts) a la altura.
    public String getHeight() {
        return this.height + " mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    // Sobreescribimos el método toString que se hereda de la clase Object para modificar su contenido y utilizarlo luego.
    @Override
    public String toString() {
        return "\nPatient\n" + super.toString() + "\nAge: " +birthday +
                "\nWeight: " + getWeight() + ", Height: " + getHeight() +
                "\nBlood: " + blood ;
    }

    // Es obligatorio implementar el método showDataUser() de la clase abstracta User, porque fue declarado como abstracto en la clase padre y se tiene que usar si o si en las clases hijas.
    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historia Clínica");
    }
}
