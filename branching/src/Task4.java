import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {

        String Water = "Вода";
        Float waterCost = 1.3f;
        int waterQty = 47;

        String Candy = "Конфета";
        Float candyCost = 0.9f;
        int candyQty = 78;

        String Bomb = "Бомба";
        Float bombCost = 1f;
        int bombQty = 30;

        String Card = "Card";
        Float cardCost = 3f;
        int cardQty = 39;

        String Cookie = "Печенье";
        Float cookieCost = 0.6f;
        int cookieQty = 53;


        System.out.println("Ассортимент: \n1. Вода -- " + waterCost + " (" + waterQty + ")" +
                "\n2. Конфета -- " + candyCost + " (" + candyQty + ")" +
                "\n3. Бомба -- " + bombCost + " (" + bombQty + ")" +
                "\n4. Card -- " + cardCost + " (" + cardQty + ")" +
                "\n5. Печенье -- " + cookieCost + " (" + cookieQty + ")");
        System.out.println("Автомат сдачи не выдаёт!");
        System.out.println("Внесите оплату: ");
        Scanner Vending = new Scanner(System.in);
        float money = Vending.nextFloat();
        float ostatok=0;
        System.out.println("Выберите товар: 1. Вода 2. Конфета 3. Бомба 4. Card 5. Печенье ");

        int Choose = Vending.nextInt();
        switch (Choose) {
            case 1 -> {

                if (waterQty == 0) {
                    System.out.println("Воды нет в наличии");
                } else {
                    System.out.println("Воды в наличии: " + waterQty);
                    System.out.println("Стоимость 1шт.: " + waterCost);
                    if (money < waterCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - waterCost));
                        --waterQty;
                    }
                }

            }
            case 2 -> {

                if (candyQty == 0) {
                    System.out.println("Конфет нет в наличии");
                } else {
                    System.out.println("Конфет в наличии: " + candyQty);
                    System.out.println("Стоимость 1шт.: " + candyCost);
                    if (money < candyCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - candyCost));
                        --candyQty;
                    }
                }

            }
            case 3 -> {

                if (bombQty == 0) {
                    System.out.println("Бомб нет в наличии");
                } else {
                    System.out.println("Бомб в наличии: " + bombQty);
                    System.out.println("Стоимость 1шт.: " + bombCost);
                    if (money < bombCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - bombCost));
                        --bombQty;
                    }
                }

            }
            case 4 -> {

                if (cardQty == 0) {
                    System.out.println("Карт нет в наличии");
                } else {
                    System.out.println("Карт в наличии: " + cardQty);
                    System.out.println("Стоимость 1шт.: " + cardCost);
                    if (money < cardCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - cardCost));
                        --cardQty;
                    }
                }

            }
            case 5 -> {

                if (cookieQty == 0) {
                    System.out.println("Печенек нет в наличии");
                } else {
                    System.out.println("Печенек в наличии: " + cookieQty);
                    System.out.println("Стоимость 1шт.: " + cookieCost);
                    if (money < cookieCost) {

                        System.out.println("Не хватает денег");

                    } else {
                        System.out.println("После оплаты: " + (ostatok += money - cookieCost));
                        --cookieQty;
                    }
                }

            }

        }
        System.out.println("Ассортимент: \n1. Вода -- " + waterCost + " (" + waterQty + ")" +
                "\n2. Конфета -- " + candyCost + " (" + candyQty + ")" +
                "\n3. Бомба -- " + bombCost + " (" + bombQty + ")" +
                "\n4. Card -- " + cardCost + " (" + cardQty + ")" +
                "\n5. Печенье -- " + cookieCost + " (" + cookieQty + ")");

    }
}