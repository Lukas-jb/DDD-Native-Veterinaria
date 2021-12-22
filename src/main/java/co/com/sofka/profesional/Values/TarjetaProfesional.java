package co.com.sofka.profesional.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TarjetaProfesional implements ValueObject<String> {

    private final String value;

    public TarjetaProfesional(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        }
    }
    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetaProfesional that = (TarjetaProfesional) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
