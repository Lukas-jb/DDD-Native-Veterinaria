package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;

public class nombreDeVeterinarioActualizado extends DomainEvent {
    private final Nombre Nombre;
    private final Cedula Cedula;

    public co.com.sofka.profesional.Values.Cedula getCedula() {
        return Cedula;
    }

    public nombreDeVeterinarioActualizado(Cedula entityId, Nombre nombre) {
        super("sofka.profesional.nombreDeVeterinarioActualizado");
        this.Cedula = entityId;
        this.Nombre = nombre;
    }

    public Nombre getNombre() {
        return Nombre;
    }
}
