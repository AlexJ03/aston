package Homework_2.Task_1;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        sedan.start();
        sedan.stop();

        System.out.println(sedan.getFuelType());
        System.out.println(sedan.getNumberOfDoors());
        System.out.println(sedan.getTrunkCapacity());
        System.out.println(sedan.getLuxuryLevel());

        truck.start();
        truck.stop();

        System.out.println(truck.getFuelType());
        System.out.println(truck.getNumberOfDoors());
        System.out.println(truck.getTrunkCapacity());
        System.out.println(truck.getMaxLoadCapacity());
    }
}
