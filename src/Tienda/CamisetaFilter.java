package Tienda;

import java.util.ArrayList;

public interface CamisetaFilter {
    ArrayList<Camiseta> filtrar(ArrayList<Camiseta> camisetas, CamisetaCriterio criterio);
}
