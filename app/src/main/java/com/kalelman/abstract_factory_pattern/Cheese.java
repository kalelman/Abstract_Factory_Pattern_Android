package com.kalelman.abstract_factory_pattern;

public class Cheese implements Filling {

    @Override
    public String name() {
        return "Queso";
    }

    @Override
    public String calories() {
        return " : 54 Kcal";
    }
}
