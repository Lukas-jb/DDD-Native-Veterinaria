package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.domain.generic.DomainEvent;

public class profecionalAsociado extends DomainEvent {
    private final IdVeterinario IdProfecional;

    public profecionalAsociado(IdVeterinario idProfecional) {
        super("sofka.atencionveterinaria.profecionalAsociado");
        this.IdProfecional=idProfecional;
    }

    public IdVeterinario IdProfecional() {
        return IdProfecional;
    }
}
