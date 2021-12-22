package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.atencionVeterinaria.HistoriClinica;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;

public class GenerarAtencionVeterinaria extends Command {
    private final IdAtencion entityId;
    private final HistoriClinica historiClinica;

    public GenerarAtencionVeterinaria(IdAtencion entityId, HistoriClinica historiClinica) {
        this.entityId = entityId;
        this.historiClinica = historiClinica;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public HistoriClinica getHistoriClinica() {
        return historiClinica;
    }
}
