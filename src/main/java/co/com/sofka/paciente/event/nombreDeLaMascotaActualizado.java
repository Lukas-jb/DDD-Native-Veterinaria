package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class nombreDeLaMascotaActualizado extends DomainEvent {
    private  co.com.sofka.Generic.Nombre Nombre;

    public nombreDeLaMascotaActualizado(Nombre nombre) {
        super("sofka.paciente.nombredelamascotasctualizado");
        this.Nombre = nombre;
    }

    public co.com.sofka.Generic.Nombre Nombre() {
        return Nombre;
    }
}
