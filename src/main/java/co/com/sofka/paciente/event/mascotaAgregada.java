package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.Especie;
import co.com.sofka.paciente.Values.IdMascota;
import co.com.sofka.paciente.Values.Sexo;

public class mascotaAgregada extends DomainEvent {
    private  IdMascota entityId;
    private  Sexo sexo;
    private  Nombre nombre;
    private  Especie especie;

    public mascotaAgregada(IdMascota entityId, Sexo sexo, Nombre nombre, Especie especie) {
        super("sofka.paciente.mascotaAgregada");
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
