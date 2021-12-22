package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;

public class nombreDeAuxiliarActualizado extends DomainEvent {

    private  Cedula Cedula;
    private  Nombre Nomre;

    public nombreDeAuxiliarActualizado(Cedula entityId, Nombre nombre) {
        super("sofka.profesional.nombreActualizado");
        this.Cedula = entityId;
        this.Nomre = nombre;
    }

    public Cedula getCedula() {
        return Cedula;
    }

    public Nombre getNomre() {
        return Nomre;
    }
}
