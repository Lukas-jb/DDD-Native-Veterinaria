package co.com.sofka.profesional.Values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class Cedula extends Identity{

    public  Cedula(){

    }

    private Cedula(String id){
        super(id);
    }

    public static Cedula of(String id){
        return new Cedula(id);
    }


}
