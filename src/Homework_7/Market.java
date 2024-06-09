package Homework_7;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Market {
    private static final int TIME = 120;
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        Runnable task = () -> {
            int buyersCount = new Random().nextInt(3);
            for (int i = 0; i < buyersCount; i++) {
                new Thread(new Buyer()).start();
            }
        };

        scheduler.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            scheduler.shutdown();
            System.out.println("Конец симуляции.");
        }, TIME, TimeUnit.SECONDS);
    }
}