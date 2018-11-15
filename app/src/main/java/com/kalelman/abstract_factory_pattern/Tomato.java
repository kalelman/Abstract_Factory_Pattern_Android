package com.kalelman.abstract_factory_pattern;

public class Tomato implements Filling {

    @Override
    public String name() {
        return "Tomate";
    }

    @Override
    public String calories() {
        return " : 20 Kcal";
    }
}
