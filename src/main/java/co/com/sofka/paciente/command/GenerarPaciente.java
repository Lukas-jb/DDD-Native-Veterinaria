package co.com.sofka.paciente.command;

import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.paciente.Values.Registrado;
import co.com.sofka.domain.generic.Command;

public class GenerarPaciente extends Command {
    private final IdPaciente entityId    ;
    private final Registrado registrado   ;

    public IdPaciente getEntityId() {
        return entityId;
    }

    public Registrado getRegistrado() {
        return registrado;
    }

    public GenerarPaciente(IdPaciente entityId, Registrado registrado) {
        this.entityId = entityId;
        this.registrado = registrado;
    }
}
