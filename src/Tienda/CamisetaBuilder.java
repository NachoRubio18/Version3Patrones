package Tienda;

public abstract class CamisetaBuilder {
    protected Camiseta camiseta;

    public Camiseta getCamiseta() {
        return camiseta;
    }

    public void createNewCamiseta() {
        camiseta = new Camiseta();
    }

    public abstract void setNombre();
    public abstract void setPrecio();
    public abstract void setColor();
    public abstract void setTalla();
}