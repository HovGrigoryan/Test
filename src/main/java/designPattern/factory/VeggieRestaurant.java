package designPattern.factory;

import designPattern.factory.burgers.Burger;
import designPattern.factory.burgers.VeggieBurger;

public class VeggieRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        System.out.println("Creating veggie burger");
        System.out.println("Adding veggie meat");
        return new VeggieBurger();
    }
}
