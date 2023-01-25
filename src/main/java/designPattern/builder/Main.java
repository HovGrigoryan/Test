package designPattern.builder;

public class Main {

    public static void main(String[] args) {
           new Car.Builder()
                  .brand("Lamborghini")
                .model("Huracan")
                .color("red")
                .engine("8L")
                .height(1)
                .nbrOfDoors(2)
                .build();
    }
}
