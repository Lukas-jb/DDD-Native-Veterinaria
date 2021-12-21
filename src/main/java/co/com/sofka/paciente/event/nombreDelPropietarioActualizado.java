package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class nombreDelPropietarioActualizado extends DomainEvent {
    private  co.com.sofka.Generic.Nombre Nombre;

    public nombreDelPropietarioActualizado(Nombre nombre) {
        super("sofka.paciente.nombredelpropietarioactualizado");
        this.Nombre = nombre;
    }

    public co.com.sofka.Generic.Nombre Nombre() {
        return Nombre;
    }
}
