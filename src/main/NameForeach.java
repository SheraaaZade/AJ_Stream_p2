package main;

import domaine.Employe;

import java.util.function.Consumer;

public class NameForeach implements Consumer<Employe> {

    @Override
    public void accept(Employe employe) {
        System.out.println(employe);
    }
}
