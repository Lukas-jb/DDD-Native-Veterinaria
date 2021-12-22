package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class telefonoDeVeterinarioActualizado extends DomainEvent {
    private final Telefono Telefono;

    public telefonoDeVeterinarioActualizado(Telefono telefono) {
        super("sofka.profesional.telefonoDeVeterinarioActualizado");
        this.Telefono=telefono;
    }
    public co.com.sofka.Generic.Telefono getTelefono() {
        return Telefono;
    }
}
