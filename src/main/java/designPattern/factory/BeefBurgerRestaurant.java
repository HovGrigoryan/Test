package designPattern.factory;

import designPattern.factory.burgers.BeefBurger;
import designPattern.factory.burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating beef burger");
        System.out.println("Adding beef meat");
        return new BeefBurger();
    }
}
