package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.paciente.Values.IdAtencion;
import co.com.sofka.paciente.Values.IdMascota;
import co.com.sofka.paciente.Values.IdPropietario;
import co.com.sofka.paciente.event.*;
import co.com.sofka.profesional.Values.Cedula;

import java.util.Objects;

public class Paciente extends AggregateEvent<IdPaciente> {

    protected IdPropietario idPropietario;
    protected IdAtencion idAtencion;
    protected IdMascota idMascota;

    public Paciente(IdPaciente entityId, Propietario propietario) {
        super(entityId);
        appendChange(new PacienteCreado(entityId, propietario)).apply();
    }

    public void actualizarPropietario(IdPropietario idPropietario) {
        appendChange(new PropietarioDeLaMascotaActualizado(idPropietario)).apply();
    }

    public void actualizarNombreDeMascota(Nombre nombre) {
        appendChange(new nombreDeLaMascotaActualizado(nombre)).apply();
    }

    public void actualizarNombreDePropietario(Nombre nombre) {
        appendChange(new nombreDelPropietarioActualizado(nombre)).apply();
    }

    public void actualizarTelefonoPropietario(Telefono telefono){
        appendChange(new telefonoDelPropietarioActualizado(telefono)).apply();
    }


}
