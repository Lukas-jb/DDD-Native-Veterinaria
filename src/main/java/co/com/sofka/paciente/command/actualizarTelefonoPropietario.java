package co.com.sofka.paciente.command;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdPropietario;

public class actualizarTelefonoPropietario extends Command {
    private final IdPropietario entityId;
    private final Telefono telefono;

    public actualizarTelefonoPropietario(IdPropietario entityId, Telefono telefono) {
        this.entityId = entityId;
        this.telefono = telefono;
    }
    public IdPropietario getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
