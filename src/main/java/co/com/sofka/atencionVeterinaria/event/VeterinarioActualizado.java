package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class VeterinarioActualizado extends DomainEvent {
    private final IdVeterinario IdVeterinario;
    private final IdAtencion IdAtencion;

    public VeterinarioActualizado(IdAtencion entityId, IdVeterinario idVeterinario) {
        super("sofka.paciente.veterinarioactualizado");
        this.IdAtencion =entityId;
        this.IdVeterinario=idVeterinario;
    }

    public co.com.sofka.paciente.Values.IdAtencion getIdAtencion() {
        return IdAtencion;
    }

    public co.com.sofka.atencionVeterinaria.Values.IdVeterinario IdVeterinario() {
        return IdVeterinario;
    }
}
