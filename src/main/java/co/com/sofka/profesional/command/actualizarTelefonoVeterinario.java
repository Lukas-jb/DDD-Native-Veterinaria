package co.com.sofka.profesional.command;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.profesional.Values.Cedula;

public class actualizarTelefonoVeterinario extends Command {
    private final Cedula entityId;
    private final Telefono telefono;

    public actualizarTelefonoVeterinario(Cedula entityId, Telefono telefono) {
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public Cedula getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
