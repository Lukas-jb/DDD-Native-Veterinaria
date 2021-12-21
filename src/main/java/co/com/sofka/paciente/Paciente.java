package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.paciente.Values.*;
import co.com.sofka.paciente.event.*;

import java.util.Objects;
import java.util.ResourceBundle;

public class Paciente extends AggregateEvent<IdPaciente> {

    protected Registrado registrado;
    protected Mascota mascota;
    protected Propietario propietario;

    public Paciente(IdPaciente entityId, Registrado registrado) {
        super(entityId);
        appendChange(new PacienteCreado(entityId)).apply();
    }

    public Paciente(IdPaciente entityId) {
        super(entityId);
        subscribe(new pacienteChange(this));
    }

    public void agregarPropietario(IdPropietario entityId, Nombre nombre, Telefono telefono) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);
        appendChange(new propietarioAgregado(entityId,nombre, telefono)).apply();
    }

    public void actualizarNombreDeMascota(IdPropietario entityId, Nombre nombre, Telefono telefono) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(telefono);

        appendChange(new nombreDeLaMascotaActualizado(entityId, nombre, telefono)).apply();
    }

    public void agregarMascota(IdMascota entityId, Sexo sexo, Nombre nombre, Especie especie) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(sexo);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(especie);
        appendChange(new mascotaAgregada(entityId, sexo, nombre, especie)).apply();
    }

    public void actualizarNombreDePropietario(Nombre nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new nombreDelPropietarioActualizado(nombre)).apply();
    }

    public void actualizarTelefonoPropietario(Telefono telefono) {
        Objects.requireNonNull(telefono);
        appendChange(new telefonoDelPropietarioActualizado(telefono)).apply();
    }
}
