package co.com.sofka.atencionVeterinaria.command;

import co.com.sofka.atencionVeterinaria.Values.Reporte;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.paciente.Values.IdAtencion;

public class AgregarReporteHistoriaClinica extends Command {
    private final IdAtencion entityId;
    private final Reporte reporte;

    public AgregarReporteHistoriaClinica(IdAtencion entityId, Reporte reporte) {
        this.entityId = entityId;
        this.reporte = reporte;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public Reporte getReporte() {
        return reporte;
    }
}
