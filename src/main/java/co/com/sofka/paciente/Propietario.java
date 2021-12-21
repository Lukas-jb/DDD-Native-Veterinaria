package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.paciente.Values.IdPropietario;

import java.util.Objects;

public class Propietario extends Entity<IdPropietario> {

    protected Nombre nombre;
    protected Telefono telefono;

    public Propietario(IdPropietario entityId, Nombre nombre, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public void ActualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }
    public void ActualizarTelefono(Telefono telefono){
        this.telefono = Objects.requireNonNull(telefono);
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
