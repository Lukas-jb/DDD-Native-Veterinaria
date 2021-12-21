package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;

public class MedicoVeterinarioAgregado extends DomainEvent {
    private  Cedula entityId;
    private  Nombre nombre;
    private  Telefono telefono;

    public MedicoVeterinarioAgregado(Cedula entityId, Nombre nombre, Telefono telefono) {
        super("sofka.profesional.MedicoVeterinarioAgregado");
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
