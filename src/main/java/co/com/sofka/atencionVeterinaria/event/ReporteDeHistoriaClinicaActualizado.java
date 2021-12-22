package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.Reporte;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class ReporteDeHistoriaClinicaActualizado extends DomainEvent {
    private final Reporte Reporte;
    private final IdAtencion IdAtencion;

    public ReporteDeHistoriaClinicaActualizado(IdAtencion entityId, Reporte reporte) {
        super("sofka.paciente.pacientecreado");
        this.IdAtencion= entityId;
        this.Reporte=reporte;
    }

    public co.com.sofka.paciente.Values.IdAtencion getIdAtencion() {
        return IdAtencion;
    }

    public co.com.sofka.atencionVeterinaria.Values.Reporte Reporte() {
        return Reporte;
    }
}
