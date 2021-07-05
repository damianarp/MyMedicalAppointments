// Importaciones necesarias.
package model;

// Creamos una clase abstracta User con sus atributos.
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    // Constructor de la clase abstracta User con sus parámetros obligatorios.
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters de la clase User.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Validamos el número de teléfono.
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El número telefónico debe ser de 10 dígitos máximo");
        } else if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }
    }

    // Sobreescribimos el método toString que se hereda de la clase Object para modificar su contenido y utilizarlo luego.
    @Override
    public String toString() {
        return "Name: " + name + ", Email: " + email +
                "\nAddress: " + address + ", Phone Number: " + phoneNumber;
    }

    /**
     * Creamos el método abstracto showDataUser() que muestre información sobre los usuarios.
     * Al ser abstracto, no lleva llaves, solo debemos declararlo.
     * */
    public abstract void showDataUser();
}
