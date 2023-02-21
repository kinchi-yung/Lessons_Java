public class Room {
    private String roomName;
    private String roomDescription;

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

    public void printItems(){
        System.out.println("В этой комнате нет доступных предметов");
    }
}
