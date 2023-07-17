
package modelos;

public class Usuario {
    
    private String identificacion;
    private String nombre;
    private String correo;
    private String contraseña;

    public Usuario(String identificacion, String nombre, String correo, String contraseña) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
       
}
