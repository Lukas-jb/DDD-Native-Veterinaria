package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdPropietario;

public class telefonoDelPropietarioActualizado extends DomainEvent {
    private final Telefono Telefono;
    private final IdPropietario IdPropietario;

    public co.com.sofka.paciente.Values.IdPropietario getIdPropietario() {
        return IdPropietario;
    }

    public telefonoDelPropietarioActualizado(IdPropietario entityId, Telefono telefono) {
        super("sofka.paciente.telefonoDelPropietarioActualizado");
        this.IdPropietario = entityId;
        this.Telefono=telefono;

    }

    public co.com.sofka.Generic.Telefono getTelefono() {
        return Telefono;
    }
}
