import java.util.Scanner;

public class Player {
    String name;
    Item[] inventory = new Item[10];
    Room currentRoom;
    Scanner sc = new Scanner(System.in);

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату: " + currentRoom.getRoomName());
    }

    public void showItems() {
        for (Item s : inventory) {
            System.out.println(s);
        }
    }

    public void interact() {
        currentRoom.printItems();
        int i = sc.nextInt();
        if (i>-1 || items[i] instanceof Collectible){
            System.out.println("Хотите положить предмет в инвентарь или использовать?" +
                    "\n1.Положить в инвентарь" +
                    "\n2.Использовать");
            int temp = sc.nextInt();
            if (temp == 1){
                inventory += items[i];
            }else if (temp==2){

            }
        }
    }
}
