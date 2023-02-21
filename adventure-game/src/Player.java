public class Player{
    String name;
    Item[] inventory = new Item[10];
    Room currentRoom;

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
        System.out.println("Вы перешли в комнату: "+currentRoom);
    }
}
