package com.kalelman.abstract_factory_pattern;

public class Coke implements Drink {

    @Override
    public String name() {
        return "Coca cola";
    }

    @Override
    public String calories() {
        return " : 148 kcal";
    }
}
