import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {

        String Water = "Вода";
        Float WaterCost = 1.3f;
        int WaterQty = 47;

        String Candy = "Конфета";
        Float CandyCost = 0.9f;
        int CandyQty = 78;

        String Bomb = "Бомба";
        Float BombCost = 1f;
        int BombQty = 30;

        String Card = "Card";
        Float CardCost = 3f;
        int CardQty = 39;

        String Cookie = "Печенье";
        Float CookieCost = 0.6f;
        int CookieQty = 53;


        System.out.println("Ассортимент: \n1. Вода -- " + WaterCost + " (" + WaterQty + ")" +
                "\n2. Конфета -- " + CandyCost + " (" + CandyQty + ")" +
                "\n3. Бомба -- " + BombCost + " (" + BombQty + ")" +
                "\n4. Card -- " + CardCost + " (" + CardQty + ")" +
                "\n5. Печенье -- " + CookieCost + " (" + CookieQty + ")");
        System.out.println("Автомат сдачи не выдаёт!");
        System.out.println("Внесите оплату: ");
        Scanner Vending = new Scanner(System.in);
        float money = Vending.nextFloat();
        float ostatok=0;
        System.out.println("Выберите товар: 1. Вода 2. Конфета 3. Бомба 4. Card 5. Печенье ");

        int Choose = Vending.nextInt();
        switch (Choose) {
            case 1 -> {

                if (WaterQty == 0) {
                    System.out.println("Воды нет в наличии");
                } else {
                    System.out.println("Воды в наличии: " + WaterQty);
                    System.out.println("Стоимость 1шт.: " + WaterCost);
                    if (money < WaterCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - WaterCost));
                        --WaterQty;
                    }
                }

            }
            case 2 -> {

                if (CandyQty == 0) {
                    System.out.println("Конфет нет в наличии");
                } else {
                    System.out.println("Конфет в наличии: " + CandyQty);
                    System.out.println("Стоимость 1шт.: " + CandyCost);
                    if (money < CandyCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - CandyCost));
                        --CandyQty;
                    }
                }

            }
            case 3 -> {

                if (BombQty == 0) {
                    System.out.println("Бомб нет в наличии");
                } else {
                    System.out.println("Бомб в наличии: " + BombQty);
                    System.out.println("Стоимость 1шт.: " + BombCost);
                    if (money < BombCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - BombCost));
                        --BombQty;
                    }
                }

            }
            case 4 -> {

                if (CardQty == 0) {
                    System.out.println("Карт нет в наличии");
                } else {
                    System.out.println("Карт в наличии: " + CardQty);
                    System.out.println("Стоимость 1шт.: " + CardCost);
                    if (money < CardCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - CardCost));
                        --CardQty;
                    }
                }

            }
            case 5 -> {

                if (CookieQty == 0) {
                    System.out.println("Печенек нет в наличии");
                } else {
                    System.out.println("Печенек в наличии: " + CookieQty);
                    System.out.println("Стоимость 1шт.: " + CookieCost);
                    if (money < CookieCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - CookieCost));
                        --CookieQty;
                    }
                }

            }

        }
        System.out.println("Ассортимент: \n1. Вода -- " + WaterCost + " (" + WaterQty + ")" +
                "\n2. Конфета -- " + CandyCost + " (" + CandyQty + ")" +
                "\n3. Бомба -- " + BombCost + " (" + BombQty + ")" +
                "\n4. Card -- " + CardCost + " (" + CardQty + ")" +
                "\n5. Печенье -- " + CookieCost + " (" + CookieQty + ")");

    }
}