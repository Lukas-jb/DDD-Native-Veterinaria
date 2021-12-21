package co.com.sofka.paciente.event;

import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Mascota;
import co.com.sofka.paciente.Propietario;
import co.com.sofka.paciente.Values.IdAtencion;

public class PacienteCreado extends DomainEvent {


    private  IdPaciente entityId;
    private  Propietario propietario;
    private  Mascota idmascota;
    private  IdAtencion idAtencion;

    public PacienteCreado(IdPaciente entityId, Propietario propietario, Mascota idmascota, IdAtencion idAtencion) {
        super("sofka.paciente.pacientecreado");
        this.entityId = entityId;
        this.propietario = propietario;
        this.idmascota = idmascota;
        this.idAtencion = idAtencion;
    }

    public IdPaciente getEntityId() {
        return entityId;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Mascota getIdmascota() {
        return idmascota;
    }

    public IdAtencion getIdAtencion() {
        return idAtencion;
    }
}
