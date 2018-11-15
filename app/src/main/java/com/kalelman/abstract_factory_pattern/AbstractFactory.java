package com.kalelman.abstract_factory_pattern;

public abstract class AbstractFactory {

    abstract Bread getBread(String breadType);
    abstract Filling getFilling(String fillingType);
    abstract  Drink getDrink(String drinkType);
}

