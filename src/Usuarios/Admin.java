package Usuarios;

public class Admin extends Persona {

    private static Admin instance = null;

    private Admin(String nombre, String email, String contrasena) {
        super(nombre, email, contrasena);
    }

    public static Admin getInstance(String nombre, String email, String contrasena) {
        if (instance == null) {
            instance = new Admin(nombre, email, contrasena);
        }
        return instance;
    }
}
