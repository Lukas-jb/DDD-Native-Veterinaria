package co.com.sofka.atencionVeterinaria;

import co.com.sofka.Generic.Fecha;
import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.atencionVeterinaria.Values.IdVeterinario;
import co.com.sofka.atencionVeterinaria.Values.Reporte;
import co.com.sofka.atencionVeterinaria.event.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

import java.util.List;
import java.util.Objects;
import java.util.Set;


public class AtencionVeterinaria extends AggregateEvent<IdAtencion> {

    protected Set<FormulaMedica> foulasMedicas;
    protected IdVeterinario profecional;
    protected IdPaciente paciente;
    protected HistoriClinica historiClinica;

    public AtencionVeterinaria(IdAtencion entityId,HistoriClinica historiClinica) {
        super(entityId);
        appendChange(new AtencionVeterinariaRealizada(entityId,historiClinica)).apply();
    }

   public AtencionVeterinaria(IdAtencion entityId){
        super(entityId);
        subscribe(new AtencionVeterinariaChange(this));
   }
   public  static AtencionVeterinaria from (IdAtencion idAtencion, List<DomainEvent>events){
        var atencionveterinaria = new AtencionVeterinaria(idAtencion);
       events.forEach(atencionveterinaria::applyEvent);
        return atencionveterinaria;
   }

    public void AgregarFormulaMedica(IdAtencion entityId, Fecha fecha, Descripcion descripcion){
        Objects.nonNull(entityId);
        Objects.nonNull(fecha);
        Objects.nonNull(descripcion);
        appendChange(new fortmulaMedicaAgregada(entityId, fecha, descripcion)).apply();
    }
    public void asociarPaciente(co.com.sofka.atencionVeterinaria.Values.IdPaciente idPaciente){
        Objects.nonNull(idPaciente);
        appendChange(new pacienteAsociado(idPaciente)).apply();
    }
    public void asociarProfecional (IdVeterinario idProfecional){
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

    public void agregarreportehostoriaclinica(Reporte reporte){
        Objects.nonNull(reporte);
        appendChange(new ReporteDeHistoriaClinicaActualizado(reporte)).apply();
    }

}
