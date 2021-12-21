package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class telefonoDelPropietarioActualizado extends DomainEvent {
    private final Telefono Telefono;

    public telefonoDelPropietarioActualizado(Telefono telefono) {
        super("sofka.paciente.telefonoDelPropietarioActualizado");
        this.Telefono=telefono;

    }

    public co.com.sofka.Generic.Telefono getTelefono() {
        return Telefono;
    }
}
