package co.com.sofka.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdPropietario;

public class PropietarioDeLaMascotaActualizado extends DomainEvent {
    private final IdPropietario IdPropietario;

    public PropietarioDeLaMascotaActualizado(IdPropietario idPropietario) {
        super("sofka.paciente.PropietarioDeLaMascotaActualizado");
        this.IdPropietario=idPropietario;
    }

    public co.com.sofka.paciente.Values.IdPropietario IdPropietario() {
        return IdPropietario;
    }
}
