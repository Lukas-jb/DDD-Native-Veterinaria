package co.com.sofka.atencionVeterinaria;

import co.com.sofka.Generic.Fecha;
import co.com.sofka.Generic.Nombre;
import co.com.sofka.atencionVeterinaria.Values.IdHistoriaClinica;
import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.atencionVeterinaria.Values.Reporte;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class HistoriClinica extends Entity<IdHistoriaClinica> {

    private Fecha fecha;
    private IdVeterinario veterinario;
    private Reporte reporte;

    public HistoriClinica(IdHistoriaClinica entityId, Fecha fecha, IdVeterinario veterinario, Reporte reporte) {
        super(entityId);
        this.fecha = fecha;
        this.veterinario = veterinario;
        this.reporte = reporte;
    }

    public void AgregarReporte(Reporte reporte) {
        this.reporte = Objects.requireNonNull(reporte);
    }

    public Fecha Fecha() {
        return fecha;
    }

    public IdVeterinario Veterinario() {
        return veterinario;
    }

    public Reporte Reporte() {
        return reporte;
    }
}
