package co.com.sofka.paciente.command;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.Especie;
import co.com.sofka.paciente.Values.IdMascota;
import co.com.sofka.paciente.Values.Sexo;

public class agregarMascota extends Command {
    private final IdMascota entityId;
    private final Sexo sexo;
    private final Nombre nombre;
    private final Especie especie;

    public agregarMascota(IdMascota entityId, Sexo sexo, Nombre nombre, Especie especie) {
        this.entityId = entityId;
        this.sexo = sexo;
        this.nombre = nombre;
        this.especie = especie;
    }

    public IdMascota getEntityId() {
        return entityId;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Especie getEspecie() {
        return especie;
    }
}
