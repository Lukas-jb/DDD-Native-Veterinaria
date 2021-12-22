package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;

public class AsociarProfecional extends Command {
    private final IdAtencion entityId               ;
    private final IdVeterinario idProfecional       ;

    public AsociarProfecional(IdAtencion entityId, IdVeterinario idProfecional) {
        this.entityId = entityId;
        this.idProfecional = idProfecional;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public IdVeterinario getIdProfecional() {
        return idProfecional;
    }
}
