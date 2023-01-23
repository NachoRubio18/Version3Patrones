package Usuarios;

public class Jugador extends Persona implements Component {

    private String rol;
    private boolean titular;
    private int clausulaRescision;
    private String fechaFinContrato;

    public Jugador(String DNI, String nombre, String apellidos, String fechaDeNacimiento, String telefono, String rol, boolean titular, int clausulaRescision, String fechaFinContrato) {
        super(DNI, nombre, apellidos, fechaDeNacimiento, telefono);
        this.rol = rol;
        this.titular = titular;
        this.clausulaRescision = clausulaRescision;
        this.fechaFinContrato = fechaFinContrato;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public int getClausulaRescision() {
        return clausulaRescision;
    }

    public void setClausulaRescision(int clausulaRescision) {
        this.clausulaRescision = clausulaRescision;
    }

    public String getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(String fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion del Jugador:");
        System.out.println("Nombre: " + this.getNombre() + " " + this.getApellidos());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Rol: " + this.rol);
        System.out.println("Titular: " + this.titular);
        System.out.println("Clausula de rescision: " + this.clausulaRescision);
        System.out.println("Fecha fin de contrato: " + this.fechaFinContrato);
    }
}
