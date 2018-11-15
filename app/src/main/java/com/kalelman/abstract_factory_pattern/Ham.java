package com.kalelman.abstract_factory_pattern;

public class Ham implements Filling {

    @Override
    public String name() {
        return "Jamon";
    }

    @Override
    public String calories() {
        return " : 194 kcal";
    }
}
