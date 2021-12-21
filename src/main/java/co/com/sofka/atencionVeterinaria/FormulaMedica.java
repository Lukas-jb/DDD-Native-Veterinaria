package co.com.sofka.atencionVeterinaria;

import co.com.sofka.Generic.Fecha;
import co.com.sofka.Generic.Nombre;
import co.com.sofka.atencionVeterinaria.Values.Descripcion;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.paciente.Values.IdAtencion;

import java.util.Objects;

public class FormulaMedica extends Entity<IdAtencion> {

    private  Fecha fecha;
    private  Descripcion descripcion;

    public FormulaMedica(IdAtencion entityId, Fecha fecha, Descripcion descripcion) {
        super(entityId);
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    public void ModificarDescripcion(Descripcion descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Fecha Fecha() {
        return fecha;
    }

    public Descripcion Descripcion() {
        return descripcion;
    }
}
