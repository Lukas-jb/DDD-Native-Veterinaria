package co.com.sofka.profesional;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.profesional.event.AuxiliarVeterinarioAgregado;
import co.com.sofka.profesional.event.MedicoVeterinarioAgregado;
import co.com.sofka.profesional.event.ProfesionalCreado;

import javax.swing.*;
import java.util.HashSet;

public class profesionalChange extends EventChange {

    public profesionalChange(Profesional profesional) {
        apply((ProfesionalCreado event) -> {
            profesional.medicosVeterinarios =event.getMedicoVeterinario();
            profesional.auxiliaresVeterinarios = new HashSet<>();
        });

        apply((AuxiliarVeterinarioAgregado event)->{
            profesional.auxiliaresVeterinarios.add(new AuxiliarVeterinario(
                    event.EntityId(),
                    event.Nombre(),
                    event.Telefono()));
        });
        apply((MedicoVeterinarioAgregado event)->{
            profesional.medicosVeterinarios.nombre = event.getNombre();
            profesional.medicosVeterinarios.tarjetaProfesional=event.getTarjetaProfesional();
            profesional.medicosVeterinarios.telefono= event.getTelefono();
        });
        apply(());

    }
}
