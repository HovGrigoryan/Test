package designPattern.builder;

import java.util.Objects;

public class Car {

    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int nbrOfDoors;

    private Car(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
        this.height = builder.height;
        this.nbrOfDoors = builder.nbrOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && height == car.height && nbrOfDoors == car.nbrOfDoors && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, height, brand, model, color, engine, nbrOfDoors);
    }

    public int getId() {
        return id;
    }

    public int getHeight() {
        return height;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public int getNbrOfDoors() {
        return nbrOfDoors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int id;
        private int height;
        private String brand;
        private String model;
        private String color;
        private String engine;
        private int nbrOfDoors;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder nbrOfDoors(int nbrOfDoors) {
            this.nbrOfDoors = nbrOfDoors;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
