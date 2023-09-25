package models;

public class Usuario {

    private final String identificacion;
    private final String nombre;
    private final String correo;
    private final char rol;

    public Usuario(String identificacion, String nombre, String correo, char rol) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public char getRol() {
        return rol;
    }

}
