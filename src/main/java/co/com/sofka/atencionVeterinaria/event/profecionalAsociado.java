package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class profecionalAsociado extends DomainEvent {
    private final IdVeterinario IdProfecional;
    private final IdAtencion IdAtencion;

    public profecionalAsociado(IdAtencion entityId, IdVeterinario idProfecional) {
        super("sofka.atencionveterinaria.profecionalAsociado");
        this.IdAtencion=entityId;
        this.IdProfecional=idProfecional;
    }

    public co.com.sofka.paciente.Values.IdAtencion getIdAtencion() {
        return IdAtencion;
    }

    public IdVeterinario IdProfecional() {
        return IdProfecional;
    }
}
