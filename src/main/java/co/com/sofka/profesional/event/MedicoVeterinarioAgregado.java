package co.com.sofka.profesional.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;
import co.com.sofka.profesional.Values.TarjetaProfesional;

public class MedicoVeterinarioAgregado extends DomainEvent {


    protected final Cedula entityId;
    protected  Nombre nombre;
    protected final TarjetaProfesional tarjetaProfesional;
    protected  Telefono telefono;

    public MedicoVeterinarioAgregado(Cedula entityId, Nombre nombre, TarjetaProfesional tarjetaProfesional, Telefono telefono) {
        super("sofka.profesional.MedicoVeterinarioAgregado");

        this.entityId = entityId;
        this.nombre = nombre;
        this.tarjetaProfesional = tarjetaProfesional;
        this.telefono = telefono;
    }

    public Cedula getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public TarjetaProfesional getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
