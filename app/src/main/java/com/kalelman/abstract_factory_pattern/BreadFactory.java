package com.kalelman.abstract_factory_pattern;

public class BreadFactory extends AbstractFactory {

    @Override
    Bread getBread(String breadType) {

        if (breadType == null) {
            return null;
        }

        if (breadType == "BAG") {
            return new Baguette();
        } else if (breadType == "ROLL") {
            return  new Roll();
        } else if (breadType == "SLICED") {
            return new Sliced();

        }

        return null;
    }

    @Override
    Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    Drink getDrink(String drinkType) {
        return null;
    }
}
