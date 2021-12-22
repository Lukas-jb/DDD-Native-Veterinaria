package co.com.sofka.atencionVeterinaria.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CriterioDX implements ValueObject<String> {
    private final String value;

    public CriterioDX(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        };
    }

    @Override
    public String value() {
        return value;
    }
}
