package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdPropietario;

public class nombreDeLaMascotaActualizado extends DomainEvent {
    private IdPropietario entityId;
    private Nombre nombre;
    private Telefono telefono;

    public nombreDeLaMascotaActualizado(IdPropietario entityId, Nombre nombre) {
        super("sofka.paciente.nombredelamascotasctualizado");
        this.entityId = entityId;
        this.nombre = nombre;

    }

    public IdPropietario getEntityId() {
        return entityId;
    }


    public Nombre getNombre() {
        return nombre;
    }
}
