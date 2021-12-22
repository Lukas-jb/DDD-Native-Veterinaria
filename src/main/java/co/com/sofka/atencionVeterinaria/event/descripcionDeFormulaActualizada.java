package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.paciente.Values.IdAtencion;

public class descripcionDeFormulaActualizada extends DomainEvent {
    private final IdAtencion IdAtencion;
    private  co.com.sofka.atencionVeterinaria.Values.Descripcion Descripcion;


    public descripcionDeFormulaActualizada(IdAtencion entityId, Descripcion descripcion) {
        super("sofka.paciente.descripciondeformulaactualizada\"");
        this.IdAtencion=entityId;
        this.Descripcion = descripcion;
    }
    public co.com.sofka.atencionVeterinaria.Values.Descripcion getDescripcion() {
        return Descripcion;
    }

    public co.com.sofka.atencionVeterinaria.Values.Descripcion Descripcion() {
        return Descripcion;
    }
}
