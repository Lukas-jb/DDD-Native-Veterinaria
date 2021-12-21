package co.com.sofka.paciente.Values;

import co.com.sofka.domain.generic.ValueObject;

public class Registrado implements ValueObject<Boolean> {
    @Override
    public Boolean value() {
        return false;
    }

}
