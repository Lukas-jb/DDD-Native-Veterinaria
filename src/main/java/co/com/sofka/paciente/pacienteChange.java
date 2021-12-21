package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.atencionVeterinaria.Values.IdPaciente;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.paciente.event.PacienteCreado;
import co.com.sofka.paciente.event.nombreDelPropietarioActualizado;
import co.com.sofka.profesional.event.ProfesionalCreado;

public class pacienteChange extends EventChange {
    public pacienteChange(Paciente paciente) {
        apply((PacienteCreado event) -> {
            paciente.propietario = event.getPropietario();
            paciente.mascota = event.getIdmascota();
            paciente.idAtencion = event.getIdAtencion();

        });
        apply((nombreDelPropietarioActualizado event) -> {
            paciente.propietario = event.Nombre();
        });
    }
}
