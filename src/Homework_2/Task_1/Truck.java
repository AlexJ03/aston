package Homework_2.Task_1;

public class Truck extends Car {
    @Override
    public void start() {
        System.out.println("Грузовик едет...");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public String getFuelType() {
        return "Дизель";
    }

    @Override
    int getNumberOfDoors() {
        return 2;
    }

    @Override
    int getTrunkCapacity() {
        return 2000;
    }

    int getMaxLoadCapacity() {
        return 4000;
    }
}
