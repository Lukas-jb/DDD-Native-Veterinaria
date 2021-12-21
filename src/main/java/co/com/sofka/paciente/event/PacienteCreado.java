package co.com.sofka.paciente.event;

import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Propietario;

public class PacienteCreado extends DomainEvent {
    private final Propietario propietario;
    private final IdPaciente idpaciente;

    public PacienteCreado(IdPaciente entityId, Propietario propietario) {
        super("sofka.paciente.pacientecreado");
        this.idpaciente=entityId;
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public IdPaciente getIdpaciente() {
        return idpaciente;
    }
}
