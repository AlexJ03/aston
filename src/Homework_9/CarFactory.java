package Homework_9;

public class CarFactory extends Factory {

    @Override
    public Thing createThing() {
        return new Car();
    }
}
