package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.profesional.Values.Cedula;

import java.util.Objects;

public class AuxiliarVeterinario extends Entity<Cedula> {

    protected Nombre nombre;
    protected Telefono telefono;

    public AuxiliarVeterinario(Cedula entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void ActualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void ActualizarTelefono(Telefono telefono) {
        this.telefono = Objects.requireNonNull(telefono);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefonoelefono() {
        return telefono;
    }

}
