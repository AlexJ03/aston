package Homework_2.Task_1;

public class Sedan extends Car {
    @Override
    public void start() {
        System.out.println("Седан едет...");
    }

    @Override
    public void stop() {
        System.out.println("Седан остановился");
    }

    @Override
    public String getFuelType() {
        return "Бензин";
    }

    @Override
    int getNumberOfDoors() {
        return 4;
    }

    @Override
    int getTrunkCapacity() {
        return 530;
    }

    String getLuxuryLevel() {
        return "Премиальный";
    }
}
