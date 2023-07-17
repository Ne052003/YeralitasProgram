package modelos;

public class Empleado {

  private String idEmpleado;
  private String idGerente2;
  private String nomEmpl;
  private String apeEmpl;
  private String numEmpl;
  private String fechIngresoEmpl;
  private int areaEmpl;
  private String fechNacEmpl;

  // Constructores
  public Empleado(
      String idEmpleado,
      String idGerente2,
      String nomEmpl,
      String apeEmpl,
      String numEmpl,
      String fechIngresoEmpl,
      int areaEmpl,
      String fechNacEmpl) {
    this.idEmpleado = idEmpleado;
    this.idGerente2 = idGerente2;
    this.nomEmpl = nomEmpl;
    this.apeEmpl = apeEmpl;
    this.numEmpl = numEmpl;
    this.fechIngresoEmpl = fechIngresoEmpl;
    this.areaEmpl = areaEmpl;
    this.fechNacEmpl = fechNacEmpl;
  }

  public Empleado(String idEmpleado, String nomEmpl) {
    this.idEmpleado = idEmpleado;
    this.nomEmpl = nomEmpl;
  }

  // Se generan los Getters y Setters de los atributos antes declarados
  public String getIdEmpleado() {
    return idEmpleado;
  }

  public void setIdEmpleado(String idEmpleado) {
    this.idEmpleado = idEmpleado;
  }

  public String getIdGerente2() {
    return idGerente2;
  }

  public void setIdGerente2(String idGerente2) {
    this.idGerente2 = idGerente2;
  }

  public String getNomEmpl() {
    return nomEmpl;
  }

  public void setNomEmpl(String nomEmpl) {
    this.nomEmpl = nomEmpl;
  }

  public String getApeEmpl() {
    return apeEmpl;
  }

  public void setApeEmpl(String apeEmpl) {
    this.apeEmpl = apeEmpl;
  }

  public String getNumEmpl() {
    return numEmpl;
  }

  public void setNumEmpl(String numEmpl) {
    this.numEmpl = numEmpl;
  }

  public String getFechIngresoEmpl() {
    return fechIngresoEmpl;
  }

  public void setFechIngresoEmpl(String fechIngresoEmpl) {
    this.fechIngresoEmpl = fechIngresoEmpl;
  }

  public int getAreaEmpl() {
    return areaEmpl;
  }

  public void setAreaEmpl(int areaEmpl) {
    this.areaEmpl = areaEmpl;
  }

  public String getFechNacEmpl() {
    return fechNacEmpl;
  }

  public void setFechNacEmpl(String fechNacEmpl) {
    this.fechNacEmpl = fechNacEmpl;
  }
}
