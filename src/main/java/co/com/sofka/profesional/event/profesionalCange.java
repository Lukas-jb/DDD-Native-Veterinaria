package co.com.sofka.profesional.event;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.profesional.MedicoVeterinario;
import co.com.sofka.profesional.Profesional;

public class profesionalCange extends EventChange {

    public profesionalCange(Profesional profesional) {
        apply((ProfesionalCreado event) -> {
            profesional.identity();
        });

        apply((MedicoVeterinarioAgregado event)->{
            profesional.
        });

    }
}
