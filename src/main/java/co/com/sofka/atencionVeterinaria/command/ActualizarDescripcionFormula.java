package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;

public class ActualizarDescripcionFormula extends Command {
    private final IdAtencion entityId;
    private final Descripcion descripcion;

    public ActualizarDescripcionFormula(IdAtencion entityId, Descripcion descripcion) {
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
