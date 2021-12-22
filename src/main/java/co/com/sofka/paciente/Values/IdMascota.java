package co.com.sofka.paciente.Values;

import co.com.sofka.domain.generic.Identity;

public class IdMascota extends Identity {

    public IdMascota() {

    }

    private IdMascota(String id) {
        super(id);
    }

    public static IdMascota of(String id) {
        return new IdMascota(id);

    }
}

