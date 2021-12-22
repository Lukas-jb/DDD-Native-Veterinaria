package co.com.sofka.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Telefono implements ValueObject<Long> {
    private final Long value;

    public Telefono(Long value) {
        this.value = value;
        if (this.value== Objects.requireNonNull(value)) {
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono = (Telefono) o;
        return Objects.equals(value, telefono.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Long value() {
        return value;
    }
}
