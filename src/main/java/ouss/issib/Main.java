package ouss.issib;

import ouss.issib.composants.Boisson;
import ouss.issib.composants.Deca;
import ouss.issib.composants.Sumatra;
import ouss.issib.decorator.Caramel;
import ouss.issib.decorator.Chocolat;
import ouss.issib.decorator.Noisette;

public class Main {
    static void main() {
        Boisson boisson ;
        boisson = new Sumatra();
        System.out.println( boisson.getDescription());
        System.out.println( boisson.cout() + " DH");

        System.out.println("------------------");
        boisson = new Chocolat(boisson);
        System.out.println( boisson.getDescription());
        System.out.println( boisson.cout() + " DH");

        System.out.println("------------------");
        boisson = new Caramel(boisson);
        System.out.println( boisson.getDescription());
        System.out.println( boisson.cout() + " DH");

        System.out.println("------------------");
        boisson = new Chocolat(new Noisette(new Caramel(new Sumatra())));
        System.out.println( boisson.getDescription());
        System.out.println( boisson.cout() + " DH");

    }
}
