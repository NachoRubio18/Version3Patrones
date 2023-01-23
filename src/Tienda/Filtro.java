package Tienda;

import java.util.ArrayList;

public class Filtro implements CamisetaFilter {
    @Override
    public ArrayList<Camiseta> filtrar(ArrayList<Camiseta> camisetas, CamisetaCriterio criterio) {
        ArrayList<Camiseta> filtradas = new ArrayList<>();
        for (Camiseta camiseta : camisetas) {
            if (camiseta.getColor().equals(criterio.getColor())) {
                filtradas.add(camiseta);
            }
            if (camiseta.getNombre().equals(criterio.getNombre())) {
                filtradas.add(camiseta);
            }
            if (camiseta.getPrecio() ==criterio.getPrecio()) {
                filtradas.add(camiseta);
            }
            if (camiseta.getTalla().equals(criterio.getTalla())) {
                filtradas.add(camiseta);
            }
        }
        return filtradas;
    }
}
