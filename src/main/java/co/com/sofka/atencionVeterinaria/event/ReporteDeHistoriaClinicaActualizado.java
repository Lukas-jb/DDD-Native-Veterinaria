package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.Reporte;
import co.com.sofka.domain.generic.DomainEvent;

public class ReporteDeHistoriaClinicaActualizado extends DomainEvent {
    private final Reporte Reporte;

    public ReporteDeHistoriaClinicaActualizado(Reporte reporte) {
        super("sofka.paciente.pacientecreado");
        this.Reporte=reporte;
    }

    public co.com.sofka.atencionVeterinaria.Values.Reporte Reporte() {
        return Reporte;
    }
}
