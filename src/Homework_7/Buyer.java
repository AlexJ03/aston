package Homework_7;

import java.util.*;

public class Buyer implements IBuyer, IUseBasket, Runnable {
    public static int id;
    private static final List<String> GOODS = Arrays.asList("Молоко", "Хлеб", "Шоколад", "Макароны");
    private static final Map<String, Integer> PRICES = new HashMap<>() {{
        put("Молоко", 80);
        put("Хлеб", 30);
        put("Шоколад", 90);
        put("Макароны", 60);
    }};
    private final Map<String, Integer> basket = new HashMap<>();
    private static final Random RANDOM = new Random();

    public Buyer() {
        id += 1;
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель " + id + " зашел в магазин");
    }

    @Override
    public void chooseGoods() {
        int goodsCount = 1 + (int) (Math.random() * 4);
        for (int i = 0; i < goodsCount; i++) {
            try {
                Thread.sleep((long) (500 + Math.random() * 1500));
                String good = GOODS.get((int) (Math.random() * GOODS.size()));
                basket.put(good, PRICES.get(good));
                System.out.println("Покупатель " + id + " выбрал " + good + " стоимостью " + PRICES.get(good));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void goOut() {
        System.out.println("Покупатель " + id + " ушел");
    }

    @Override
    public void takeBasket() {
        try {
            Thread.sleep((long) (500 + Math.random() * 1500));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Покупатель " + id + " взял корзину.");
    }

    @Override
    public void putGoodsToBasket() {
        try {
            Thread.sleep((long) (500 + Math.random() * 1500) * basket.size());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Покупатель " + id + " положил товары в корзину: " + basket);
    }

    @Override
    public void run() {
        enterToMarket();
        chooseGoods();
        goOut();
    }
}
