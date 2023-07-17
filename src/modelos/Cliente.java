package modelos;

public class Cliente {

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
}
