package Homework_9;

public class Main {

    public static void main(String[] args) {
        Factory doorFactory = new DoorFactory();
        Thing door = doorFactory.createThing();
        door.use();

        Factory carFactory = new CarFactory();
        Thing car = carFactory.createThing();
        car.use();
    }
}
