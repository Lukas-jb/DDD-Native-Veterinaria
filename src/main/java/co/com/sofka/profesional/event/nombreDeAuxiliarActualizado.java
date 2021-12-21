package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class nombreDeAuxiliarActualizado extends DomainEvent {

    private  Nombre Nomre;

    public nombreDeAuxiliarActualizado(Nombre nombre) {
        super("sofka.profesional.nombreActualizado");
        this.Nomre = nombre;
    }

    public Nombre Nomre() {
        return Nomre;
    }
}
