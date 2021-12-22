package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class PacienteAsociado extends DomainEvent {
    private final IdPaciente IdPaciente;
    private final IdAtencion IdAtencion;

    public co.com.sofka.paciente.Values.IdAtencion getIdAtencion() {
        return IdAtencion;
    }

    public PacienteAsociado(IdAtencion entityId, IdPaciente idPaciente) {
        super("sofka.atencionveterinaria.pacienteasociado");
        this.IdAtencion= entityId;
        this.IdPaciente=idPaciente;
    }

    public co.com.sofka.atencionVeterinaria.Values.IdPaciente IdPaciente() {
        return IdPaciente;
    }
}
