package co.com.sofka.atencionVeterinaria.Values;

import co.com.sofka.domain.generic.Identity;


public class IdProfecional extends Identity {
    public IdProfecional() {

    }

    private IdProfecional(String id) {
        super(id);
    }

    public static IdProfecional of(String id) {
        return new IdProfecional(id);

    }
}
