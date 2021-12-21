package co.com.sofka.atencionVeterinaria.event;

import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class descripcionDeFormulaActualizada extends DomainEvent {
    private  co.com.sofka.atencionVeterinaria.Values.Descripcion Descripcion;

    public descripcionDeFormulaActualizada(Descripcion descripcion) {
        super("sofka.paciente.descripciondeformulaactualizada\"");
        this.Descripcion = descripcion;
    }

    public co.com.sofka.atencionVeterinaria.Values.Descripcion Descripcion() {
        return Descripcion;
    }
}
