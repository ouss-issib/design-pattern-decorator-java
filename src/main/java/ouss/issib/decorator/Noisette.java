package ouss.issib.decorator;

import ouss.issib.composants.Boisson;

public class Noisette extends Decorator{
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 4.2+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Noisette";
    }
}
