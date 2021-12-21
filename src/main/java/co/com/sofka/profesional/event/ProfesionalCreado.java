package co.com.sofka.profesional.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.IdProfecional;

public class ProfesionalCreado extends DomainEvent {
        private  IdProfecional IdProfecional;

    public ProfesionalCreado(IdProfecional entityId) {
        super("sofka.profesional.profesionalCreado");
        this.IdProfecional = entityId;
    }

    public co.com.sofka.profesional.Values.IdProfecional IdProfecional() {
        return IdProfecional;
    }
}
