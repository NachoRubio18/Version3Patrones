package Usuarios;

import java.util.ArrayList;
import java.util.List;

public class ResponsableSeccion extends Persona implements Component {

    private double sueldo;
    private List<Component> jugadoresACargo = new ArrayList<>();

    public ResponsableSeccion(String DNI, String nombre, String apellidos, String fechaDeNacimiento, String telefono, int sueldo) {
        super(DNI, nombre, apellidos, fechaDeNacimiento, telefono);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void add(Component component) {
        jugadoresACargo.add(component);
    }

    @Override
    public void remove(Component component) {
        jugadoresACargo.remove(component);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del Responsable de Seccion:");
        System.out.println("Nombre: " + this.getNombre() + " " + this.getApellidos());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Sueldo: " + this.sueldo);
        System.out.println("Empleados a cargo:");
        for (Component component : jugadoresACargo) {
            component.mostrarInformacion();
        }
    }
}

