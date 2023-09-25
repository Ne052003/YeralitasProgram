package models;

import java.time.LocalTime;

public class Sesion {

    private final Usuario usuario;
    private final LocalTime LoggedTime;

    public Sesion(Usuario usuario, LocalTime LoggedTime) {
        this.usuario = usuario;
        this.LoggedTime = LoggedTime;
    }

    public LocalTime getLoggedTime() {
        return LoggedTime;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
