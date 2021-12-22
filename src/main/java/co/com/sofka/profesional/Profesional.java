package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;
import co.com.sofka.profesional.Values.IdProfecional;
import co.com.sofka.profesional.event.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Profesional extends AggregateEvent<IdProfecional> {


    protected MedicoVeterinario medicosVeterinario;
    protected Set<AuxiliarVeterinario> auxiliaresVeterinarios;

    public Profesional(IdProfecional entityId, MedicoVeterinario MedicoVeterinario) {
        super(entityId);
        appendChange(new ProfesionalCreado(entityId, MedicoVeterinario)).apply();
    }

    private Profesional(IdProfecional entityId) {
        super(entityId);
        subscribe(new profesionalChange(this));
    }

    public static Profesional from(IdProfecional idProfecional, List<DomainEvent> enets){
        var profesional=new Profesional(idProfecional);
        enets.forEach(profesional::applyEvent);
        return  profesional;
    }

    public void AgregarAuxiliarVeterinario(Cedula entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new AuxiliarVeterinarioAgregado(entityId, nombre, telefono)).apply();
    }

    public void actualizarNombreAuxiliar(Cedula entityId, Nombre nombre) {
        Objects.nonNull(nombre);
        appendChange(new NombreDeAuxiliarActualizado(entityId, nombre)).apply();
    }

    public void actualizarNombreVeterinario(Cedula entityId,Nombre nombre) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        appendChange(new NombreDeVeterinarioActualizado(entityId,nombre)).apply();
    }

    public void actualizarTelefonoVeterinario(Cedula entityId,Telefono telefono) {
        Objects.nonNull(telefono);
        appendChange(new TelefonoDeVeterinarioActualizado(entityId, telefono)).apply();
    }


    protected Optional<AuxiliarVeterinario> getAuxiliarVeterinario(Cedula entityId) {
        return auxiliaresVeterinarios
                .stream()
                .filter(pofesional -> pofesional.identity().equals(entityId))
                .findFirst();


    }
}
