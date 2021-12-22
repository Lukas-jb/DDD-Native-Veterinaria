package co.com.sofka.atencionVeterinaria.Values;

import co.com.sofka.domain.generic.Identity;


public class IdPaciente extends Identity {
    public IdPaciente() {

    }

    private IdPaciente(String id) {
        super(id);
    }

    public static IdPaciente of(String id) {
        return new IdPaciente(id);

    }
}
