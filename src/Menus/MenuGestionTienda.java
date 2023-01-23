package Menus;

import Tienda.*;

import java.util.ArrayList;

public class MenuGestionTienda {

    private Tienda tienda;

    public MenuGestionTienda() {
        this.tienda = Tienda.getInstance(new ConcreteCamisetaBuilder(), new ArrayList<Camiseta>(), new CamisetaEstados());
    }
}
