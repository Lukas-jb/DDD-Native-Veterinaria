package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;

public class ActualizarVeterinario extends Command {
    private final IdAtencion entityId;
    private final IdVeterinario idVeterinario;

    public ActualizarVeterinario(IdAtencion entityId, IdVeterinario idVeterinario) {
        this.entityId = entityId;
        this.idVeterinario = idVeterinario;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public IdVeterinario getIdVeterinario() {
        return idVeterinario;
    }
}
