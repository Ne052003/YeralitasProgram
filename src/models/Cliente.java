package models;

public class Cliente implements Entity{

    private int idCli;
    private String nomCli;
    private String numCli;
    private String dirCli;

    // Constructores
    public Cliente(String nomCli, String numCli, String dirCli) {
        this.nomCli = nomCli;
        this.numCli = numCli;
        this.dirCli = dirCli;
    }

    // Constructor para consulta
    public Cliente(int idCli, String nomCli, String numCli, String dirCli) {
        this.idCli = idCli;
        this.nomCli = nomCli;
        this.numCli = numCli;
        this.dirCli = dirCli;
    }

    public Cliente(int idCli, String nomCli) {
        this.idCli = idCli;
        this.nomCli = nomCli;
    }

    // Se generan los setters y getters de los atributos
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getNumCli() {
        return numCli;
    }

    public void setNumCli(String numCli) {
        this.numCli = numCli;
    }

    public String getDirCli() {
        return dirCli;
    }

    public void setDirCli(String dirCli) {
        this.dirCli = dirCli;
    }

    @Override
    public String[] toArray() {
        String[] registro = new String[5];
        registro[0] = this.getIdCli() + "";
        registro[1] = this.getNomCli();
        registro[2] = this.getNumCli();
        registro[3] = this.getDirCli();
        return registro;
    }
}
