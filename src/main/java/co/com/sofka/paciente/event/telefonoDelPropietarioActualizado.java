package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class telefonoDelPropietarioActualizado extends DomainEvent {
    private co.com.sofka.Generic.Telefono Telefono;

    public telefonoDelPropietarioActualizado(Telefono telefono) {
        super("sofka.paciente.telefonodelpropietarioactualizado");
        this.Telefono = telefono;
    }

    public co.com.sofka.Generic.Telefono Telefono() {
        return Telefono;
    }
}
