package co.com.sofka.paciente.command;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdPropietario;

public class agregarPropietario extends Command {
    private final IdPropietario entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public agregarPropietario(IdPropietario entityId, Nombre nombre, Telefono telefono) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdPropietario getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
