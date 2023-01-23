package Tienda;

public class ConcreteCamiseta implements CamisetaPrototype {
    private String nombre;
    private double precio;
    private String color;
    private String talla;

    public ConcreteCamiseta(String nombre, double precio, String color, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
        this.talla = talla;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public Camiseta clone() {
        Camiseta copia = new Camiseta();
        copia.setNombre(nombre);
        copia.setPrecio(precio);
        copia.setColor(color);
        copia.setTalla(talla);
        return copia;
    }
}
