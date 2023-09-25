package resources;

import controllers.ClientsPanelController;
import controllers.EmployeesPanelController;
import controllers.ManufacturePanelController;
import controllers.GerentPanelController;
import controllers.ProductPanelController;
import controllers.QueryController;
import controllers.SalesPanelController;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

import models.GestorProducto;
import models.GestorSesion;
import models.GestorCliente;
import models.GestorEmpleado;
import models.GestorGerente;
import models.GestorManufactura;
import models.GestorVenta;
import views.AgregarArea_JFrame;
import views.Consultas_JFrame;

public class GeneralMethods {

    private GeneralMethods() {
    }

    public static boolean validatePasswordSintax(String contra) {

        int uppercaseCounter = 0;
        int lowercaseCounter = 0;
        int digitCounter = 0;
        int specialCounter = 0;

        for (int i = 0; i < contra.length(); i++) {
            char c = contra.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseCounter++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCounter++;
            } else if (Character.isDigit(c)) {
                digitCounter++;
            }
            if (c >= 33 && c <= 47 || c == 64) {
                specialCounter++;
            }
        }
        return contra.length() >= 8
                && uppercaseCounter >= 1
                && lowercaseCounter >= 1
                && digitCounter >= 2
                && specialCounter >= 1;
    }

    public static boolean validateId(String id) {
        int num = 0;
        boolean verificacion = false;
        for (int i = 0; i < id.length(); i++) {
            char l = id.charAt(i);
            if (Character.isAlphabetic(l)) {
                num++;
            }
        }

        if (num == 0) {
            verificacion = true;
        }
        return verificacion;
    }

    public static boolean validateEmail(String correo) {
        Pattern pattern
                = Pattern.compile(
                        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(correo);
        return matcher.find();
    }

    public static void openFrame(JFrame frame) {
        frame.setVisible(true);
    }

    public static void openQueryFrame(int consultaNum) {
        QueryController frameController = null;
        QueryFrameProperties frameProperties = null;
        switch (consultaNum) {

            case 1 -> {
                frameController = new QueryController(new GestorProducto(), new ProductPanelController());
                frameProperties = new QueryFrameProperties("Inventory", "Inventory", Titles.PRODUCTO, new String[]{"ID", "Name", "Price", "Admission date (YYYY/MM/DD)"});
            }
            case 2 -> {
                frameController = new QueryController(new GestorVenta(), new SalesPanelController());
                frameProperties = new QueryFrameProperties("Query - Sales", "Sales", Titles.VENTA, new String[]{"Manufacture ID", "Client ID", "Employee ID", "Price", "Date (YYYY/MM/DD)"});
            }
            case 3 -> {
                frameController = new QueryController(new GestorCliente(), new ClientsPanelController());
                frameProperties = new QueryFrameProperties("Query - Clients", "Clients", Titles.CLIENTE, new String[]{"ID", "Name", "Phone number"});
            }
            case 4 -> {
                frameController = new QueryController(new GestorManufactura(), new ManufacturePanelController());
                frameProperties = new QueryFrameProperties("Query - Manufactures", "Manufactures", Titles.MANUFACTURA, new String[]{"ID", "Name", "Price"});
            }
            case 5 -> {
                frameController = new QueryController(new GestorEmpleado(), new EmployeesPanelController());
                frameProperties = new QueryFrameProperties("Query - Employees", "Employees", Titles.EMPLEADO, new String[]{"Identification", "Name", "Phone number", "Admission date"});
            }
            case 6 -> {
                frameController = new QueryController(new GestorGerente(), new GerentPanelController());
                frameProperties = new QueryFrameProperties("Query - Managers", "Managers", Titles.GERENTE, new String[]{"Identification", "Name", "Phone number"});
            }
            case 7 ->
                openFrame(new AgregarArea_JFrame());
            default ->
                Logger.getLogger(GeneralMethods.class.getName()).log(Level.SEVERE, null, "Wrong number of comboBox index");
        }
        openFrame(new Consultas_JFrame(frameController, frameProperties));
    }

    public static char getRole() {
        return GestorSesion.getSesion() != null ? GestorSesion.getSesion().getUsuario().getRol() : ' ';
    }

    public static String getStringRole() {
        switch (getRole()) {
            case 'U' -> {
                return "User: ";
            }
            case 'G' -> {
                return "Manager: ";
            }
            case 'A' -> {
                return "Administrator: ";
            }
            default ->
                throw new AssertionError();
        }
    }

}
