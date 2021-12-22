package co.com.sofka.atencionVeterinaria.Values;

import co.com.sofka.domain.generic.Identity;


public class IdHistoriaClinica extends Identity {
    public IdHistoriaClinica() {

    }

    private IdHistoriaClinica(String id) {
        super(id);
    }

    public static IdHistoriaClinica of(String id) {
        return new IdHistoriaClinica(id);

    }
}
