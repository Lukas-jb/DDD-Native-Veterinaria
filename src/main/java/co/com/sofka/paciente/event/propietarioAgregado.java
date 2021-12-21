package co.com.sofka.paciente.event;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdPropietario;

public class propietarioAgregado extends DomainEvent {


    protected IdPropietario idPropietario;
    protected Nombre nombre;
    protected Telefono telefono;

    public propietarioAgregado(IdPropietario idPropietario, Nombre nombre, Telefono telefono) {

        super("sofka.paciente.nombredelamascotasctualizado");
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.telefono = telefono;

    }

    public IdPropietario getIdPropietario() {
        return idPropietario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
