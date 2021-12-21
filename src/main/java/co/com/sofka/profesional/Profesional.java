package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.profesional.Values.Cedula;
import co.com.sofka.profesional.Values.IdProfecional;
import co.com.sofka.profesional.Values.TarjetaProfesional;
import co.com.sofka.profesional.event.*;

import java.util.Objects;
import java.util.Set;

public class Profesional extends AggregateEvent<IdProfecional> {
    protected Set<MedicoVeterinario> auxiliaresVeterinarios;
    protected Set<AuxiliarVeterinario> medicosVeterinarios;

    public Profesional(IdProfecional entityId) {
        super(entityId);
        appendChange(new ProfesionalCreado(entityId)).apply();
    }

    public void AgregarAuxiliarVeterinario(Cedula entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new AuxiliarVeterinarioAgregado(entityId, nombre, telefono)).apply();
    }

    public void AgregarMedicoVeterinario(Cedula entityId, Nombre nombre, TarjetaProfesional tarjetaProfesional, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(tarjetaProfesional);
        Objects.nonNull(telefono);
        appendChange(new MedicoVeterinarioAgregado(entityId, nombre, telefono)).apply();
    }

    public void actualizarNombreAuxiliar(Nombre nombre){
        appendChange(new nombreDeAuxiliarActualizado(nombre)).apply();
    }
    public void actualizarTelefonoAuxiliar(Telefono telefono){
        appendChange(new telefonoDeAuxiliarActualizado(telefono)).apply();
            }

    public void actualizarNombreVeterinario(Nombre nombre){
        appendChange(new nombreDeVeterinarioActualizado(nombre)).apply();
    }
    public void actualizarTelefonoVeterinario(Telefono telefono){
        appendChange(new telefonoDeVeterinarioActualizado(telefono)).apply();
    }


}
