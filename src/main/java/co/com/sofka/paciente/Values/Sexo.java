package co.com.sofka.paciente.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sexo implements ValueObject<String> {

    private final String value;

    public Sexo(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        }
        if(!this.value.equalsIgnoreCase("Hembra")||!this.value.equalsIgnoreCase("Macho")){
            throw new IllegalArgumentException("La caracteristica debe de Hembra o Macho");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sexo sexo = (Sexo) o;
        return Objects.equals(value, sexo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return null;
    }
}
