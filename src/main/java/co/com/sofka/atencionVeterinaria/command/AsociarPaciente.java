package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;
import co.com.sofka.paciente.Values.IdPaciente;

public class AsociarPaciente extends Command {
    private final IdAtencion entityId;
    private final IdPaciente idPaciente;

    public AsociarPaciente(IdAtencion entityId, IdPaciente idPaciente) {
        this.entityId = entityId;
        this.idPaciente = idPaciente;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }
}
