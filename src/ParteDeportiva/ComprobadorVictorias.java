package ParteDeportiva;

public class ComprobadorVictorias implements ObservadorPartida{

    public ComprobadorVictorias() {
    }

    @Override
    public void actualizar(Seccion seccion, Partida partida) {
        if (partida.isVictoria()){
            seccion.setNumVictorias(seccion.getNumVictorias() + 1);
        }
    }
}
