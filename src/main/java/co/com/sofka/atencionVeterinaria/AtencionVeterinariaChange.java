package co.com.sofka.atencionVeterinaria;

import co.com.sofka.atencionVeterinaria.event.*;
import co.com.sofka.domain.generic.EventChange;

public class AtencionVeterinariaChange extends EventChange {
    public AtencionVeterinariaChange(AtencionVeterinaria atencionVeterinaria) {
        apply((AtencionVeterinariaRealizada event) -> {
            atencionVeterinaria.historiClinica = event.getHistoriClinica();
        });
        apply((PacienteAsociado event) -> {
            atencionVeterinaria.paciente = event.IdPaciente();
        });
        apply((ProfecionalAsociado event) -> {
            atencionVeterinaria.profecional = event.IdProfecional();
        });
        apply((VeterinarioActualizado event) -> {
            atencionVeterinaria.profecional = event.IdVeterinario();
        });
        apply((fortmulaMedicaAgregada event) -> {
            atencionVeterinaria.foulasMedicas.add(new FormulaMedica(
                    event.EntityId(),
                    event.Fecha(),
                    event.Descripcion()));
        });


    }
}
