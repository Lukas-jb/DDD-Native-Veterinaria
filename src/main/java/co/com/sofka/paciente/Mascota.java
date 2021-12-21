package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.paciente.Values.Especie;
import co.com.sofka.paciente.Values.IdMascota;
import co.com.sofka.paciente.Values.Sexo;

import java.util.Objects;

public class Mascota extends Entity<IdMascota> {
    protected Sexo sexo;
    protected Nombre nombre;
    protected Especie especie;

    public Mascota(IdMascota entityId, Sexo sexo, Nombre nombre, Especie especie) {
        super(entityId);
        this.sexo = sexo;
        this.nombre = nombre;
        this.especie = especie;
    }

    public void ActualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Sexo sexo() {
        return sexo;
    }

    public Especie especie() {
        return especie;
    }

    public Nombre nombre() {
        return nombre;
    }
}
