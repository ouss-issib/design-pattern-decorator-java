package ouss.issib.decorator;

import ouss.issib.composants.Boisson;

public class Caramel extends Decorator{
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.8+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Caramel";
    }
}
