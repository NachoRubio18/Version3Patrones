package ParteDeportiva;

public class Partida {
    private String id;
    private boolean victoria;
    private String resultado;

    public Partida(String id, boolean victoria, String resultado) {
        this.id = id;
        this.victoria = victoria;
        this.resultado = resultado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
