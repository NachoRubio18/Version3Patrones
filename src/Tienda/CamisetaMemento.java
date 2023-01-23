package Tienda;

public class CamisetaMemento {
    private String nombre;
    private double precio;
    private String color;
    private String talla;

    public CamisetaMemento(String nombre, double precio, String color, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
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
}
