package co.com.sofka.atencionVeterinaria.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Anamnesis implements ValueObject<String> {
    private final String value;

    public Anamnesis(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anamnesis anamnesis = (Anamnesis) o;
        return Objects.equals(value, anamnesis.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
