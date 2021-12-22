package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;

public class TelefonoDeVeterinarioActualizado extends DomainEvent {
    private final Telefono Telefono;
    private final Cedula Cedula;

    public co.com.sofka.profesional.Values.Cedula getCedula() {
        return Cedula;
    }

    public TelefonoDeVeterinarioActualizado(Cedula entityId, Telefono telefono) {
        super("sofka.profesional.telefonoDeVeterinarioActualizado");
        this.Cedula = entityId;
        this.Telefono=telefono;
    }
    public co.com.sofka.Generic.Telefono getTelefono() {
        return Telefono;
    }
}
