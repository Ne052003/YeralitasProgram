package models;

import java.util.List;

public interface Gestor<Entity> {

    void agregar(Entity t);

    List<Entity> obtener(int atributo, String Dato);

    void update(Entity entity);

    List<Entity> obtenerTodas();

    void eliminar(Long id);
}
