package co.com.sofka.profesional;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.Generic.Telefono;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.profesional.Values.Cedula;
import co.com.sofka.profesional.Values.IdProfecional;
import co.com.sofka.profesional.Values.TarjetaProfesional;
import co.com.sofka.profesional.event.*;

import java.security.cert.CertSelector;
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


    public void AgregarAuxiliarVeterinario(Cedula entityId, Nombre nombre, Telefono telefono) {
        Objects.nonNull(entityId);
        Objects.nonNull(nombre);
        Objects.nonNull(telefono);
        appendChange(new AuxiliarVeterinarioAgregado(entityId, nombre, telefono)).apply();
    }

    public void actualizarNombreAuxiliar(Cedula entityId, Nombre nombre) {
        Objects.nonNull(nombre);
        appendChange(new nombreDeAuxiliarActualizado(entityId, nombre)).apply();
    }

    public void actualizarNombreVeterinario(Nombre nombre) {
        Objects.nonNull(nombre);
        appendChange(new nombreDeVeterinarioActualizado(nombre)).apply();
    }

    public void actualizarTelefonoVeterinario(Telefono telefono) {
        Objects.nonNull(telefono);
        appendChange(new telefonoDeVeterinarioActualizado(telefono)).apply();
    }


    public Optional<AuxiliarVeterinario> getAuxiliarVeterinario(Cedula entityId) {
        return auxiliaresVeterinarios
                .stream()
                .filter(pofesional -> pofesional.identity().equals(entityId))
                .findFirst();


    }
}
