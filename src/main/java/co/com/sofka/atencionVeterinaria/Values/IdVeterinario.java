package co.com.sofka.atencionVeterinaria.Values;

import co.com.sofka.domain.generic.Identity;


public class IdVeterinario extends Identity {
    public IdVeterinario() {

    }

    private IdVeterinario(String id) {
        super(id);
    }

    public static IdVeterinario of(String id) {
        return new IdVeterinario(id);

    }

}
