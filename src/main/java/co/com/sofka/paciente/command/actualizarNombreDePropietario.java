package co.com.sofka.paciente.command;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdPropietario;

public class actualizarNombreDePropietario extends Command {
    private final IdPropietario entityId;
    private final Nombre nombre;

    public IdPropietario getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public actualizarNombreDePropietario(IdPropietario entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }
}
