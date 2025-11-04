package ouss.issib.decorator;

import ouss.issib.composants.Boisson;

public class Chocolat extends Decorator{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Chocolat";
    }
}
