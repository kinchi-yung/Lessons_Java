import java.util.Scanner;

public class Game {
    static boolean isGameFinished;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Item.Rooms Bathroom = new Item.Rooms("Умывальня");
        Item.Rooms Bedroom = new Item.Rooms("Спальня");
        Item.Rooms Kitchen = new Item.Rooms("Поедальня");
        Item.Rooms LivingRoom = new Item.Rooms("Гостевальня", "Большная");

        System.out.println("Добро пожаловать в игру \"Late for work\", твоя цель - найти выход из дома");

        System.out.println(Bedroom.getRoomName());
        System.out.println(Bathroom.getRoomName());
        System.out.println(Kitchen.getRoomName());
        System.out.println(LivingRoom.getRoomName());

        Player player1 = new Player();
        System.out.println("Как к вам обращаться?");
        player1.name= keyboard.nextLine();
        System.out.println(player1.name);

    }
}

