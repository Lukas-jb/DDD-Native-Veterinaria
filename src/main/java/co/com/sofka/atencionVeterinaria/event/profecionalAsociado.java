package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.IdProfecional;

public class profecionalAsociado extends DomainEvent {
    private final co.com.sofka.profesional.Values.IdProfecional IdProfecional;

    public profecionalAsociado(IdProfecional idProfecional) {
        super("sofka.atencionveterinaria.profecionalAsociado");
        this.IdProfecional=idProfecional;
    }

    public co.com.sofka.profesional.Values.IdProfecional IdProfecional() {
        return IdProfecional;
    }
}
