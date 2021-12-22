package co.com.sofka.atencionVeterinaria;

import co.com.sofka.Generic.Fecha;
import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.atencionVeterinaria.Values.Reporte;
import co.com.sofka.atencionVeterinaria.event.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.paciente.Values.IdAtencion;
import co.com.sofka.paciente.Values.IdPaciente;
import co.com.sofka.paciente.pacienteChange;
import co.com.sofka.profesional.Values.IdProfecional;

import java.util.Objects;
import java.util.Set;


public class AtencionVeterinaria extends AggregateEvent<IdAtencion> {

    protected Set<FormulaMedica> foulasMedicas;
    protected IdProfecional profecional;
    protected IdPaciente paciente;
    protected FormulaMedica formulaMedica;
    protected HistoriClinica historiClinica;

    public AtencionVeterinaria(IdAtencion entityId,HistoriClinica historiClinica,FormulaMedica formulaMedica) {
        super(entityId);
        appendChange(new AtencionVeterinariaRealizada(entityId,historiClinica,formulaMedica)).apply();
    }

   public AtencionVeterinaria(IdAtencion entityId){
        super(entityId);
        subscribe(new AtencionVeterinariaChange(this));
   }

    public void AgregarFormulaMedica(IdAtencion entityId, Fecha fecha, Descripcion descripcion){
        Objects.nonNull(entityId);
        Objects.nonNull(fecha);
        Objects.nonNull(descripcion);
        appendChange(new FortmulaMedicaAgregada(entityId, fecha, descripcion)).apply();
    }
    public void asociarPaciente(co.com.sofka.atencionVeterinaria.Values.IdPaciente idPaciente){
        Objects.nonNull(idPaciente);
        appendChange(new pacienteAsociado(idPaciente)).apply();
    }
    public void asociarProfecional (IdProfecional idProfecional){
        Objects.nonNull(idProfecional);
        appendChange(new profecionalAsociado(idProfecional)).apply();
    }
    public void actualizarVeterinario(IdVeterinario idVeterinario){
        Objects.nonNull(idVeterinario);
        appendChange(new veterinarioActualizado(idVeterinario)).apply();
    }
    public void actualizarDescripcionFormula(Descripcion descripcion){
        Objects.nonNull(descripcion);
        appendChange(new descripcionDeFormulaActualizada(descripcion)).apply();
    }

    public void aGregarReporteHostoriaClinica(Reporte reporte){
        Objects.nonNull(reporte);
        appendChange(new ReporteDeHistoriaClinicaActualizado(reporte)).apply();
    }

}
