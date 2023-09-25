package models;

public class Area implements Entity {

    private int codigoArea;
    private String nomArea;

    public Area(String nomArea) {
        this.nomArea = nomArea;
    }

    public Area(int codigoArea, String nomArea) {
        this.nomArea = nomArea;
        this.codigoArea = codigoArea;
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

    @Override
    public String[] toArray() {
        String[] registro = new String[2];
        registro[0] = this.getCodigoArea() + "";
        registro[1] = this.getNomArea();
        return registro;
    }
}
