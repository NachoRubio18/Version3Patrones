package Tienda;

import java.util.ArrayList;

public class CamisetaEstados {
    private ArrayList<CamisetaMemento> estados;

    public CamisetaEstados() {
        estados = new ArrayList<>();
    }

    public void addMemento(CamisetaMemento memento) {
        estados.add(memento);
    }

    public CamisetaMemento getMemento(int index) {
        return estados.get(index);
    }
}
