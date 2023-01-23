package Usuarios;

import java.util.Date;

public abstract class Persona implements CrearUsuario {
    private String DNI;
    private String nombre;
    private String apellidos;
    private String fechaDeNacimiento;
    private String telefono;
    private String email;
    private String contrasena;

    public Persona(String DNI, String nombre, String apellidos, String fechaDeNacimiento, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
    }

    public Persona(String nombre, String email, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }


    public String getContrasena() {
        return contrasena;
    }


    @Override
    public void crearUsuario(){
        if (this instanceof Admin){
            this.email = "admin@esportsclub.com";
            this.contrasena = "admin";
        } else {
            this.email = (this.nombre + this.apellidos).toLowerCase() + "@esportsclub.com";
            this.contrasena = this.getDNI();
        }

    }
}