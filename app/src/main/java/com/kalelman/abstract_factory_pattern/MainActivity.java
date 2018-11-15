package com.kalelman.abstract_factory_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FIL");
        Filling filling = fillingFactory.getFilling("TOM");
        Log.d(TAG, filling.name() + filling.calories());

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BAG");
        Log.d(TAG, bread.name() + bread.calories());

        AbstractFactory drinkFactory = FactoryGenerator.getFactory("DRI");
        Drink drink = drinkFactory.getDrink("COK");
        Log.d(TAG, drink.name() + drink.calories());
    }
}
