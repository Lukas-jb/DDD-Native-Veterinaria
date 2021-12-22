package co.com.sofka.profesional;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.profesional.event.*;

import java.util.HashSet;

public class profesionalChange extends EventChange {

    public profesionalChange(Profesional profesional) {
        apply((ProfesionalCreado event) -> {
            profesional.medicosVeterinario = event.getMedicoVeterinario();
            profesional.auxiliaresVeterinarios = new HashSet<>();
        });

        apply((AuxiliarVeterinarioAgregado event) -> {
            profesional.auxiliaresVeterinarios.add(new AuxiliarVeterinario(
                    event.EntityId(),
                    event.Nombre(),
                    event.Telefono()));
        });
        apply((MedicoVeterinarioAgregado event) -> {
            profesional.medicosVeterinario.nombre = event.getNombre();
            profesional.medicosVeterinario.tarjetaProfesional = event.getTarjetaProfesional();
            profesional.medicosVeterinario.telefono = event.getTelefono();
        });
        apply((NombreDeAuxiliarActualizado event) -> {
            var funcion = profesional.getAuxiliarVeterinario(event.getCedula())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el auxiliar veterinario"));
            funcion.ActualizarNombre(event.getNomre());
        });
        apply((TelefonoDeVeterinarioActualizado event) -> {
            profesional.medicosVeterinario.telefono = event.getTelefono();
        });

    }
}
