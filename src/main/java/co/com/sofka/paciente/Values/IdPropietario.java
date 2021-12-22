package co.com.sofka.paciente.Values;


import co.com.sofka.domain.generic.Identity;

public class IdPropietario extends Identity {
    public IdPropietario() {

    }

    private IdPropietario(String id) {
        super(id);
    }

    public static IdPropietario of(String id) {
        return new IdPropietario(id);

    }
}
