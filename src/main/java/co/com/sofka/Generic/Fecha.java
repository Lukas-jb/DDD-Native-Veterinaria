package co.com.sofka.Generic;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha(Date value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.before(new Date())){
            throw new IllegalArgumentException("La fecha es posteriror a la actual");
        };
    }

    @Override
    public Date value() {
        return value;
    }
}
