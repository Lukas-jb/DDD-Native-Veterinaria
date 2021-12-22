package co.com.sofka.paciente.Values;

import co.com.sofka.domain.generic.Identity;

public class IdAtencion extends Identity {

    public IdAtencion() {

    }

    private IdAtencion(String id) {
        super(id);
    }

    public static IdAtencion of(String id) {
        return new IdAtencion(id);

    }
}
