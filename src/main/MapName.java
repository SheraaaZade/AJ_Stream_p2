package main;

import domaine.Employe;

import java.util.function.Function;

public class MapName implements  Function<Employe, String>  {

    @Override
    public String apply(Employe o) {
        return o.getNom();
    }
}
