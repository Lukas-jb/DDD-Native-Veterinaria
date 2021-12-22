package co.com.sofka.profesional.command;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.profesional.Values.Cedula;

public class actualizarNombreVeterinario extends Command {
    private final Cedula entityId;
    private final Nombre nombre;

    public actualizarNombreVeterinario(Cedula entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Cedula getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
