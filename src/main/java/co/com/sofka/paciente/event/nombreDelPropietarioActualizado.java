package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdPropietario;

public class nombreDelPropietarioActualizado extends DomainEvent {
    private  IdPropietario IdPropietario;
    private  Nombre Nombre;

    public co.com.sofka.paciente.Values.IdPropietario getIdPropietario() {
        return IdPropietario;
    }

    public nombreDelPropietarioActualizado(IdPropietario entityId, Nombre nombre) {
        super("sofka.paciente.nombreDelPropietarioActualizado");
        this.IdPropietario= entityId;
        this.Nombre=nombre;

    }

    public Nombre getNombre() {
        return Nombre;
    }
}
