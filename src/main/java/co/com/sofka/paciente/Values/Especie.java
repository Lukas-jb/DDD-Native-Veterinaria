package co.com.sofka.paciente.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Especie implements ValueObject<String> {
    private final String value;

    public Especie(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Especie especie = (Especie) o;
        return Objects.equals(value, especie.value);
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
