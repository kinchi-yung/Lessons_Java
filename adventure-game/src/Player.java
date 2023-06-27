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
///////////////////    myself
//    public void interact() {
//        currentRoom.printItems();
//        int i = sc.nextInt();
//        if (i>=0 || Item.items[i] instanceof Collectible){
//            System.out.println("Хотите положить предмет в инвентарь или использовать?" +
//                    "\n1.Положить в инвентарь" +
//                    "\n2.Использовать");
//            int temp = sc.nextInt();
//            if (temp == 1){
//                Item[] inventory += ;
//            }else if (temp==2){
//                item.use;
//            }else{
//                System.out.println("Выберите корректное действие.");
//            }
//        }else{
//            item.use;
//        }
//    }
//////////////////// chat gpt 1
//    public void interact() {
//        currentRoom.printItems();
//        for (int i = 0; i < roomItems.length(); i++) {
//            System.out.println((i + 1) + ". " + roomItems.get(i).getName());
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите номер предмета:");
//        int itemNumber = scanner.nextInt();
//        if (itemNumber > 0 && itemNumber <= roomItems.length()) {
//            Item chosenItem = items.get(itemNumber - 1);
//            if (chosenItem instanceof Collectible) {
//                System.out.println("Хотите положить предмет в инвентарь или использовать его?" +
//                        "1. В инвентарь " +
//                        "2. Использовать");
//                int choice = scanner.nextInt();
//                if (choice == 1) {
//                    if (inventory.size() < inventory.length) {
//                        inventory.add(chosenItem);
//                        System.out.println("Вы добавили " + chosenItem.getName() + " в инвентарь");
//                    } else {
//                        System.out.println("Ваш инвентарь полон");
//                    }
//                } else if (choice == 2) {
//                    chosenItem.use();
//                } else {
//                    System.out.println("Некорректный выбор");
//                    return;
//                }
//            } else {
//                chosenItem.use();
//            }
//        } else {
//            System.out.println("Некорректный выбор");
//        }
//    }
    /////////////////////////chat gpt 2
//    public void interact() {
//        currentRoom.printItems();
//        if (items.isEmpty()) {
//            System.out.println("There are no items in this room.");
//            return;
//        }
//        System.out.println("Select an item number:");
//        for (int i = 0; i < items.size(); i++) {
//            System.out.println((i + 1) + ". " + items.get(i).getName());
//        }
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        if (choice < 1 || choice > roomItems.length()) {
//            System.out.println("Invalid choice.");
//            return;
//        }
//        Item selectedItem = items.get(choice-1);
//        if (selectedItem instanceof Collectible) {
//            System.out.println("Do you want to add this item to your inventory (I) or use it (U)?");
//            String answer = scanner.next();
//            if (answer.equalsIgnoreCase("I")) {
//                Collectible selectedCollectible = (Collectible) selectedItem;
//                int index = getNextFreeInventorySlot();
//                if (index == -1) {
//                    System.out.println("Your inventory is full.");
//                } else {
//                    inventory[index] = (Item) selectedCollectible;
//                    currentRoom.removeItem(selectedCollectible);
//                    System.out.println(selectedCollectible.getName() + " added to your inventory.");
//                }
//            } else if (answer.equalsIgnoreCase("U")) {
//                selectedItem.use();
//            } else {
//                System.out.println("Invalid choice.");
//            }
//        } else {
//            selectedItem.use();
//        }
//    }

    private int getNextFreeInventorySlot() {
        currentRoom.printItems();
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
