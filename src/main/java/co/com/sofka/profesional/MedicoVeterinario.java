package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.profesional.Values.Cedula;
import co.com.sofka.profesional.Values.TarjetaProfesional;
import com.sun.jdi.ObjectReference;

import java.util.Objects;

public class MedicoVeterinario extends Entity<Cedula> {

    private Nombre nombre;
    private  TarjetaProfesional tarjetaProfesional;
    private  Telefono telefono;

    public MedicoVeterinario(Cedula entityId, Nombre nombre, TarjetaProfesional tarjetaProfesional, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.tarjetaProfesional = tarjetaProfesional;
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

    public TarjetaProfesional TarjetaProfesional() {
        return tarjetaProfesional;
    }

    public Telefono Telefono() {
        return telefono;
    }
}
