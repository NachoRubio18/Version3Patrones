package Tienda;

public class ConcreteCamisetaBuilder extends CamisetaBuilder {
    @Override
    public void setNombre() {
        camiseta.setNombre("Camiseta de algodón");
    }

    @Override
    public void setPrecio() {
        camiseta.setPrecio(25.99);
    }

    @Override
    public void setColor() {
        camiseta.setColor("Blanco");
    }

    @Override
    public void setTalla() {
        camiseta.setTalla("M");
    }
}
