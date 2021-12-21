package co.com.sofka.paciente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.paciente.event.*;

public class pacienteChange extends EventChange {
    public pacienteChange(Paciente paciente) {

        apply((PacienteCreado event) -> {
            paciente.registrado = event.getRegistrado();
        });
        apply((mascotaAgregada event) -> {
            paciente.mascota.sexo = event.getSexo();
            paciente.mascota.especie = event.getEspecie();
            paciente.mascota.nombre = event.getNombre();
        });
        apply((propietarioAgregado event) -> {
            paciente.propietario.nombre = event.getNombre();
            paciente.propietario.telefono = event.getTelefono();
        });
        apply((nombreDeLaMascotaActualizado event) -> {
            paciente.mascota.nombre = event.getNombre();
        });

        apply((telefonoDelPropietarioActualizado event) -> {
            paciente.propietario.telefono = event.getTelefono();
        });
        apply((nombreDelPropietarioActualizado event)->{
            paciente.propietario.nombre = event.getNombre();
        });

    }
}