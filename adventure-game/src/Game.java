import java.util.Scanner;

public class Game {
    static boolean isGameFinished;

//    Room bedroom = new Bedroom("Спальня");
//    Room kitchen = new Kitchen("Поедальня");
//    Room bathroom = new Bathroom("Умывальня");
//    Room livingRoom = new LivingRoom("Гостевальня", "Большная");

    Room[] rooms = new Room[]{new Bedroom("Спальня"),
            new Kitchen("Поедальня"),
            new Bathroom("Умывальня"),
            new LivingRoom("Гостевальня", "Большная")};

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру \"Late for work\", твоя цель - найти выход из дома");

        Player player1 = new Player();
        System.out.println("Как к вам обращаться?");
        player1.name = keyboard.nextLine();
        System.out.println(player1.name);

    }
}

