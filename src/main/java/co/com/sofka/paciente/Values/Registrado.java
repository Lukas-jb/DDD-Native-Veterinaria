package co.com.sofka.paciente.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Registrado implements ValueObject<Boolean> {
    private final boolean value;

    public Registrado(boolean value) {
        this.value = value;
    }

    @Override
    public Boolean value() {
        return value;
    }

}
