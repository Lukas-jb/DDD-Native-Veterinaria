package co.com.sofka.profesional.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.profesional.MedicoVeterinario;
import co.com.sofka.profesional.Values.IdProfecional;

public class CrearProfesional extends Command {
    private final IdProfecional entityId;
    private final MedicoVeterinario MedicoVeterinario;

    public CrearProfesional(IdProfecional entityId, MedicoVeterinario medicoVeterinario) {
        this.entityId = entityId;
        MedicoVeterinario = medicoVeterinario;
    }

    public IdProfecional getEntityId() {
        return entityId;
    }

    public MedicoVeterinario getMedicoVeterinario() {
        return MedicoVeterinario;
    }
}
