package co.com.sofka.profesional.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.AuxiliarVeterinario;
import co.com.sofka.profesional.MedicoVeterinario;
import co.com.sofka.profesional.Values.IdProfecional;

import java.util.List;
import java.util.Set;

public class ProfesionalCreado extends DomainEvent {


    protected IdProfecional entityId;
    protected MedicoVeterinario medicoVeterinario;
    protected Set<AuxiliarVeterinario> auxiliarVeterinario;

    public ProfesionalCreado(IdProfecional entityId, MedicoVeterinario medicoVeterinario) {
        super("sofka.profesional.profesionalCreado");
        this.entityId = entityId;
        this.medicoVeterinario = medicoVeterinario;
    }

    public IdProfecional getEntityId() {
        return entityId;
    }

    public MedicoVeterinario getMedicoVeterinario() {
        return medicoVeterinario;
    }

    public Set<AuxiliarVeterinario> getAuxiliarVeterinario() {
        return auxiliarVeterinario;
    }
}
