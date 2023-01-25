package designPattern.factory;

public class MainApp {

    public static void main(String[] args) {
        Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        beefBurgerRestaurant.orderBurger();

        System.out.println("================");

        Restaurant veggieRestaurant = new VeggieRestaurant();
        veggieRestaurant.orderBurger();
    }
}
