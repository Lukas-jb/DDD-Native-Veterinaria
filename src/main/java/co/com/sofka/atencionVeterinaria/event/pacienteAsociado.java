package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.DomainEvent;

public class pacienteAsociado extends DomainEvent {
    private final IdPaciente IdPaciente;

    public pacienteAsociado(IdPaciente idPaciente) {
        super("sofka.atencionveterinaria.pacienteasociado");
        this.IdPaciente=idPaciente;
    }

    public co.com.sofka.atencionVeterinaria.Values.IdPaciente IdPaciente() {
        return IdPaciente;
    }
}
