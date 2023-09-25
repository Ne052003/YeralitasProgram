package models;

public class Venta implements Entity {

    private int idVenta;
    private String idEmpl;
    private int idCli;
    private int idManufac;
    private int cantidadManufac;
    private String fechVenta;
    private float precVenta;

    public Venta(
            String idEmpl,
            int idCli,
            int idManufac,
            int cantidadManufac,
            String fechVenta,
            float precVenta) {
        this.idEmpl = idEmpl;
        this.idCli = idCli;
        this.idManufac = idManufac;
        this.cantidadManufac = cantidadManufac;
        this.fechVenta = fechVenta;
        this.precVenta = precVenta;
    }

    public Venta(
            int idVenta,
            String idEmpl,
            int idCli,
            int idManufac,
            int cantidadManufac,
            String fechVenta,
            float precVenta) {
        this.idVenta = idVenta;
        this.idEmpl = idEmpl;
        this.idCli = idCli;
        this.idManufac = idManufac;
        this.cantidadManufac = cantidadManufac;
        this.fechVenta = fechVenta;
        this.precVenta = precVenta;
    }

    public Venta(int idManufac) {
        this.idManufac = idManufac;
    }

    // Métodos getters y setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(String idEmpl) {
        this.idEmpl = idEmpl;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getId_manufac() {
        return idManufac;
    }

    public void setId_manufac(int id_manufac) {
        this.idManufac = id_manufac;
    }

    public int getCantidadManufac() {
        return cantidadManufac;
    }

    public void setCantidadManufac(int cantidadManufac) {
        this.cantidadManufac = cantidadManufac;
    }

    public String getFechVenta() {
        return fechVenta;
    }

    public void setFechVenta(String fechVenta) {
        this.fechVenta = fechVenta;
    }

    public float getPrecVenta() {
        return precVenta;
    }

    public void setPrecVenta(float precVenta) {
        this.precVenta = precVenta;
    }

    @Override
    public String[] toArray() {
        String[] registro = new String[7];
        registro[0] = this.getIdVenta() + "";
        registro[1] = this.getIdEmpl() + "";
        registro[2] = this.getIdCli() + "";
        registro[3] = this.getId_manufac() + "";
        registro[4] = this.getCantidadManufac() + "";
        registro[5] = this.getFechVenta() + "";
        registro[6] = this.getPrecVenta() + "";
        return registro;
    }

}
