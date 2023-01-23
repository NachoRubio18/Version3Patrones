package ParteDeportiva;

import Usuarios.*;

import java.util.ArrayList;


public class Seccion {

    private int numVictorias;
    private ResponsableSeccion responsableSeccion;
    private ArrayList<Partida> partidas;

    private ComprobadorVictorias arbitro;

    public Seccion(ResponsableSeccion responsableSeccion) {
        this.responsableSeccion = responsableSeccion;
        this.partidas = new ArrayList<>();
        this.numVictorias = 0;
        this.arbitro = new ComprobadorVictorias();
    }

    public void setNumVictorias(int numVictorias) {
        this.numVictorias = numVictorias;
    }

    public int getNumVictorias() {
        return numVictorias;
    }

    public ResponsableSeccion getResponsableSeccion() {
        return responsableSeccion;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void addPartida(Partida partida) {
        partidas.add(partida);
        arbitro.actualizar(this, partida);
    }
}
