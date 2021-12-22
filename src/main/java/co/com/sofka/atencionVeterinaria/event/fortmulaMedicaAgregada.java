package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.Generic.Fecha;
import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class fortmulaMedicaAgregada extends DomainEvent {
    private final IdAtencion entityId;
    private final Fecha fecha;
    private  Descripcion descripcion;

    public fortmulaMedicaAgregada(IdAtencion entityId, Fecha fecha, Descripcion descripcion) {
        super("sofka.atencionveterinaria.fortmulamedicamgregada");
        this.entityId = entityId;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public IdAtencion EntityId() {
        return entityId;
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }
}
