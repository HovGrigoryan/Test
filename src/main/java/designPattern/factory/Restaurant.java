package designPattern.factory;

import designPattern.factory.burgers.Burger;

public abstract class Restaurant {

    public void orderBurger() {
        System.out.println("Ordering burger...");
        Burger burger = createBurger();
        burger.prepare();
    }

    // TODO: 5/16/2022 Factory method 
    public abstract Burger createBurger();
}
