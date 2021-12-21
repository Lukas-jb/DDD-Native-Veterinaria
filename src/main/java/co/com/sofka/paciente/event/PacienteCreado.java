package co.com.sofka.paciente.event;

import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Mascota;
import co.com.sofka.paciente.Propietario;
import co.com.sofka.paciente.Values.IdAtencion;
import co.com.sofka.paciente.Values.Registrado;

public class PacienteCreado extends DomainEvent {


    private  Registrado Registrado;
    private  IdPaciente entityId;
    private  Propietario propietario;
    private  Mascota idmascota;
    private  IdAtencion idAtencion;

    public PacienteCreado(IdPaciente entityId) {
        super("sofka.paciente.pacientecreado");
        this.entityId = entityId;
        this.propietario = propietario;
        this.idmascota = idmascota;
        this.idAtencion = idAtencion;
        this.Registrado = Registrado;
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

    public Registrado getRegistrado() {
        return Registrado;
    }
}
