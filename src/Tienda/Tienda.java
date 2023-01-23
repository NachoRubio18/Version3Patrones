package Tienda;

import Usuarios.Admin;

import java.util.ArrayList;

public class Tienda {

    private static Tienda instance = null;
    private CamisetaBuilder camisetaBuilder;
    private ArrayList<Camiseta> camisetasPredefinidas;

    private CamisetaEstados camisetaEstados;

    private Tienda(CamisetaBuilder camisetaBuilder, ArrayList<Camiseta> camisetasPredefinidas, CamisetaEstados camisetaEstados) {
        this.camisetaBuilder = camisetaBuilder;
        this.camisetasPredefinidas = camisetasPredefinidas;
        this.camisetaEstados = camisetaEstados;
    }


    public static Tienda getInstance(CamisetaBuilder camisetaBuilder, ArrayList<Camiseta> camisetasPredefinidas, CamisetaEstados camisetaEstados) {
        if (instance == null) {
            instance = new Tienda(camisetaBuilder, camisetasPredefinidas, camisetaEstados);
        }
        return instance;
    }
    public void setCamisetaBuilder(CamisetaBuilder builder) {
        camisetaBuilder = builder;
    }

    public Camiseta getCamiseta() {
        return camisetaBuilder.getCamiseta();
    }

    public void construirCamiseta() {
        camisetaBuilder.createNewCamiseta();
        camisetaBuilder.setNombre();
        camisetaBuilder.setPrecio();
        camisetaBuilder.setColor();
        camisetaBuilder.setTalla();
    }

    public Camiseta clonarCamiseta(ConcreteCamiseta camisetaAClonar){
        return camisetaAClonar.clone();
    }

    public void guardarEstado(Camiseta camiseta) {
        camisetaEstados.addMemento(new CamisetaMemento(getCamiseta().getNombre(), getCamiseta().getPrecio(), getCamiseta().getColor(), getCamiseta().getTalla()));
    }

    public ArrayList<Camiseta> filtrarCamisetas(ArrayList<Camiseta> camisetasAFiltrar, CamisetaCriterio especificaciones) {
        Filtro filtro = new Filtro();
        return filtro.filtrar(camisetasAFiltrar, especificaciones);
    }
}
