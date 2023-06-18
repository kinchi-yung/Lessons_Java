public abstract class Room {
    private String roomName;
    private String roomDescription;

    Item[] items;
    private Room currentRoom;

//    public void addItems(Object item, int index){
//        items[index] = (Item) item;
//    }
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public abstract void printItems();
    
//    public void setCurrentRoom(Room currentRoom) {
//        this.currentRoom = currentRoom;
//        System.out.println("Вы перешли в комнату: " + currentRoom.getRoomName());
//    }
}
    
