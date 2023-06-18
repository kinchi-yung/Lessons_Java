import java.util.Scanner;

public class Game {
    static boolean isGameFinished = false;

    static Room[] rooms = new Room[]{new Bedroom("Спальня"),
            new Kitchen("Поедальня"),
            new Bathroom("Умывальня"),
            new LivingRoom("Гостевальня", "Большная")};
    //static Room kitchen = new Kitchen("fff");

    public static void main(String[] args) {

        int action;
        int roomN;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Добро пожаловать в игру \"Late for work\", твоя цель - найти выход из дома");

        Player player1 = new Player();
        System.out.println("Как к вам обращаться?");
        player1.name = keyboard.nextLine();
        System.out.println(player1.name);


        while (true) {
            if (isGameFinished == true) {
                System.out.println("Поздравляем, вы победили!");
                break;
            } else {
                action = showMenu();
                if (action == 0) {
                    break;
                } else if (action == 1) {
                    roomN = showRooms();
                    player1.setCurrentRoom(rooms[roomN]);
                    switch (roomN){
                        case 0:{
                            rooms[0].printItems();
                        }
                        case 1: {
                            rooms[1].printItems();
                        }
                        case 2:{
                            rooms[2].printItems();
                        }
                        case 3:{
                            rooms[3].printItems();
                        }
                    }
                } else if (action == 2) {
                    player1.showItems();
                }else if (action == 3){

                }
            }
        }
    }



//    public void printItems() {
//
//        if (items.length > 0) {
//            for (Item s : items) {
//                System.out.println("Предметы в комнате " + getRoomName() + ": " + s.getName());
//                return;
//            }
//        } else {
//            System.out.println("В комнате нет вещей");
//        }
//    }
    public static int showMenu() {
        System.out.println("2. Показать инвентарь.\n1. Перейти в другую комнату. \n0. Выход.");
        Scanner keyboard = new Scanner(System.in);
        int action = keyboard.nextInt();
        return action;
    }

    public static int showRooms() {
        System.out.println("0. " + rooms[0].getRoomName() +
                "\n1. " + rooms[1].getRoomName() +
                "\n2. " + rooms[2].getRoomName() +
                "\n3. " + rooms[3].getRoomName());
        Scanner keyboard = new Scanner(System.in);
        int roomN = keyboard.nextInt();
        return roomN;

//        switch(){
//            case (0) ->{
//
//            }
//            break;
//            case (1) ->{
//                Kitchen.printItems();
//            }
//            break;
//            case (2) ->{
//
//            }
//            break;
//            case (3) ->{
//            }
//            break;
//        }
    }

}

