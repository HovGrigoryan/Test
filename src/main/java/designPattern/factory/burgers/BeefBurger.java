package designPattern.factory.burgers;

import designPattern.factory.burgers.Burger;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Beef burger");
    }
}
