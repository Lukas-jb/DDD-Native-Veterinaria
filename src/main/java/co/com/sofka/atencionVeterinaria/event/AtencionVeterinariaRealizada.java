package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class AtencionVeterinariaRealizada extends DomainEvent {
    private final IdAtencion IdAtencion;

    public AtencionVeterinariaRealizada(IdAtencion entityId) {
        super("sofka.AtencionVeterinaria.AtencionVeterinariaRealizada");
        this.IdAtencion=entityId;
    }

    public co.com.sofka.paciente.Values.IdAtencion IdAtencion() {
        return IdAtencion;
    }
}
