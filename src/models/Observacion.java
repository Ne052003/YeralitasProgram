package models;

public class Observacion implements Entity {

    private int id_observ;
    private int id_produ_2;
    private String fech_observ;
    private String obervacion;

    public Observacion(int id_produ_2, String fech_observ, String obervacion) {
        this.id_produ_2 = id_produ_2;
        this.fech_observ = fech_observ;
        this.obervacion = obervacion;
    }

    public Observacion(int id_observ, int id_produ_2, String fech_observ, String obervacion) {
        this.id_observ = id_observ;
        this.id_produ_2 = id_produ_2;
        this.fech_observ = fech_observ;
        this.obervacion = obervacion;
    }

    public int getId_observ() {
        return id_observ;
    }

    public void setId_observ(int id_observ) {
        this.id_observ = id_observ;
    }

    public int getId_produ_2() {
        return id_produ_2;
    }

    public void setId_produ_2(int id_produ_2) {
        this.id_produ_2 = id_produ_2;
    }

    public String getFech_observ() {
        return fech_observ;
    }

    public void setFech_observ(String fech_observ) {
        this.fech_observ = fech_observ;
    }

    public String getObervacion() {
        return obervacion;
    }

    public void setObervacion(String obervacion) {
        this.obervacion = obervacion;
    }

    @Override
    public String[] toArray() {
        return new String[]{};
    }

}
