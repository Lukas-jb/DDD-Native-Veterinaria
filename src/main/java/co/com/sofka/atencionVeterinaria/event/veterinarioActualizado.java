package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.domain.generic.DomainEvent;

public class veterinarioActualizado extends DomainEvent {
    private final IdVeterinario IdVeterinario;

    public veterinarioActualizado(IdVeterinario idVeterinario) {
        super("sofka.paciente.veterinarioactualizado");
        this.IdVeterinario=idVeterinario;
    }

    public co.com.sofka.atencionVeterinaria.Values.IdVeterinario IdVeterinario() {
        return IdVeterinario;
    }
}
