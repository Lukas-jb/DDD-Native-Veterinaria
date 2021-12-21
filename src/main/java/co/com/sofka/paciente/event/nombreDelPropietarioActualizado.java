package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class nombreDelPropietarioActualizado extends DomainEvent {
    private  Nombre Nombre;

    public nombreDelPropietarioActualizado(Nombre nombre) {
        super("sofka.paciente.nombreDelPropietarioActualizado");
        this.Nombre=nombre;
    }

    public Nombre getNombre() {
        return Nombre;
    }
}
