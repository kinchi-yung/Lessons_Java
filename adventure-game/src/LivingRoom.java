public class LivingRoom {
    private String roomName;
    private String roomDescription;
    public LivingRoom(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }
    public LivingRoom(String roomName) {
        this(roomName,"");
    }

    Item[] items = new Item[] {new Item ("Люстра","Высоко висит"),
            new Item ("Кресло","Большое и мягкое"),
            new Item ("Ковёр","Простой ковёр"),
            new Item ("Магический стол","Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе")};
}
