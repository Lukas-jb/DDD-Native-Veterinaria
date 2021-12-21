package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.paciente.Values.IdAtencion;
import co.com.sofka.paciente.Values.IdMascota;
import co.com.sofka.paciente.Values.IdPropietario;
import co.com.sofka.paciente.event.*;

public class Paciente extends AggregateEvent<IdPaciente> {

    protected Propietario propietario;
    protected Mascota mascota;
    protected IdMascota idMascota;
    protected IdAtencion idAtencion;


    public Paciente(IdPaciente entityId, Propietario propietario, Mascota idMascota,IdAtencion idAtencion) {
        super(entityId);
        appendChange(new PacienteCreado(entityId, propietario, idMascota, idAtencion)).apply();
    }

    public Paciente(IdPaciente entityId){
        super(entityId);
        subscribe(new pacienteChange(this));
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
