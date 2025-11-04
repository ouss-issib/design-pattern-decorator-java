package ouss.issib;

import ouss.issib.composants.Boisson;
import ouss.issib.composants.Deca;
import ouss.issib.composants.Espresso;
import ouss.issib.composants.Sumatra;

public class Main {
    static void main() {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription() + " cout : " + boisson.cout() + " Dh");
        boisson = new Deca();
        System.out.println(boisson.getDescription() + " cout : " + boisson.cout() + " Dh");
        boisson = new Sumatra();
        System.out.println(boisson.getDescription() + " cout : " + boisson.cout() + " Dh");

    }
}
