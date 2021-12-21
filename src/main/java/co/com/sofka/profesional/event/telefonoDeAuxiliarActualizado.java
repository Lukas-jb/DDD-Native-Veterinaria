package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class telefonoDeAuxiliarActualizado extends DomainEvent {
    private final Telefono Telefono;

    public telefonoDeAuxiliarActualizado(Telefono telefono) {
        super("sofka.profesional.telefonoActualizado");
        this.Telefono=telefono;
    }

    public co.com.sofka.Generic.Telefono Telefono() {
        return Telefono;
    }
}
