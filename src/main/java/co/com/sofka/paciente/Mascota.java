package co.com.sofka.paciente;

import co.com.sofka.Generic.Nombre;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.paciente.Values.Especie;
import co.com.sofka.paciente.Values.IdMascota;
import co.com.sofka.paciente.Values.Microchip;
import co.com.sofka.paciente.Values.Sexo;

import java.util.Objects;

public class Mascota extends Entity<IdMascota> {
    private Sexo sexo;
    private Nombre nombre;
    private Especie especie;
    private Microchip microchip;

    public Mascota(IdMascota entityId, Sexo sexo, Nombre nombre, Especie especie, Microchip microchip) {
        super(entityId);
        this.sexo = sexo;
        this.nombre = nombre;
        this.especie = especie;
        this.microchip = microchip;
    }

    public void ActualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Sexo Sexo() {
        return sexo;
    }

    public Especie Especie() {
        return especie;
    }

    public Microchip Microchip() {
        return microchip;
    }

    public Nombre Nombre() {
        return nombre;
    }
}
