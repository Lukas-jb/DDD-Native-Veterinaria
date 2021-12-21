package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdPropietario;

public class nombreDeLaMascotaActualizado extends DomainEvent {
    private  IdPropietario entityId;
    private Nombre nombre;
    private  Telefono telefono;

    public nombreDeLaMascotaActualizado(IdPropietario entityId, Nombre nombre, Telefono telefono) {
        super("sofka.paciente.nombredelamascotasctualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public IdPropietario getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
