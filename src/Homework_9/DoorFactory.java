package Homework_9;

public class DoorFactory extends Factory {

    @Override
    public Thing createThing() {
        return new Door();
    }
}
