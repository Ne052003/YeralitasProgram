package modelos;

public class Area {

    private int codigoArea;
    private String nomArea;

    public Area(String nomArea) {
        this.nomArea = nomArea;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

}
