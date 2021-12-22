package co.com.sofka.profesional.command;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.profesional.Values.Cedula;

public class AgregarAuxiliarVeterinario extends Command {
    private final Cedula entityId;
    private final Nombre nombre;
    private final Telefono telefono;

    public AgregarAuxiliarVeterinario(Cedula entityId, Nombre nombre, Telefono telefono) { 
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cedula getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
