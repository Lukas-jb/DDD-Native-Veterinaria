package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;

public class AuxiliarVeterinarioAgregado extends DomainEvent {
    protected  Cedula entityId;
    protected  Nombre nombre;
    protected  Telefono telefono;

    public AuxiliarVeterinarioAgregado(Cedula entityId, Nombre nombre, Telefono telefono) {
        super("sofka.profesional.AuxiliarVeterinarioAgregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cedula EntityId() {
        return entityId;
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
