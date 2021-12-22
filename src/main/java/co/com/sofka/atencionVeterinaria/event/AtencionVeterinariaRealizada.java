package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.FormulaMedica;
import co.com.sofka.atencionVeterinaria.HistoriClinica;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class AtencionVeterinariaRealizada extends DomainEvent {


    protected  IdAtencion entityId;
    protected  HistoriClinica historiClinica;
    protected  FormulaMedica formulaMedica;

    public AtencionVeterinariaRealizada(IdAtencion entityId, HistoriClinica historiClinica) {
        super("sofka.AtencionVeterinaria.AtencionVeterinariaRealizada");

        this.entityId = entityId;
        this.historiClinica = historiClinica;
        this.formulaMedica = formulaMedica;
    }

    public IdAtencion getEntityId() {
        return entityId;
    }

    public HistoriClinica getHistoriClinica() {
        return historiClinica;
    }

    public FormulaMedica getFormulaMedica() {
        return formulaMedica;
    }
}
