package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class nombreDeVeterinarioActualizado extends DomainEvent {
    private final Nombre Nombre;

    public nombreDeVeterinarioActualizado(Nombre nombre) {
        super("sofka.profesional.nombreDeVeterinarioActualizado");
        this.Nombre = nombre;
    }

    public co.com.sofka.Generic.Nombre getNombre() {
        return Nombre;
    }
}
