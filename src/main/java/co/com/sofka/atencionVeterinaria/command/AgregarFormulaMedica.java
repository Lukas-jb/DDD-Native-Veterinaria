package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.Generic.Fecha;
import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;

public class AgregarFormulaMedica extends Command {
    private final IdAtencion entityId;
    private final Fecha fecha;
    private final Descripcion descripcion;

    public AgregarFormulaMedica(IdAtencion entityId, Fecha fecha, Descripcion descripcion) {
        this.entityId = entityId;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
