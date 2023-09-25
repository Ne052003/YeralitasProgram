package resources;

public enum Titles {

    AREA("Code", "Name"),
    MANUFACTURA("ID", "Name", "Price"),
    VENTA("ID",
            "Employee ID",
            "Client ID",
            "Manufacture ID",
            "Manufacture amount",
            "Date",
            "Price"),
    PRODUCTO(
            "ID",
            "Manager ID",
            "Name",
            "Price",
            "Unit of measurement",
            "Admission date",
            "Due date"
    ),
    GERENTE(
            "Identification",
            "Name",
            "Last name",
            "Phone number",
            "Email",
            "Birthday"
    ),
    CLIENTE("Client ID", "Name", "Phone number", "Address"),
    EMPLEADO("Identification",
            "Manager ID",
            "Name",
            "Last name",
            "Phone number",
            "Admission date",
            "Birthday",
            "Field");

    Titles(String... encabezado) {
        this.encabezado = encabezado;
    }
    private final String[] encabezado;

    public String[] getEncabezado() {
        return encabezado;
    }

}
