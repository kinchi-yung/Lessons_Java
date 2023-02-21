public class LivingRoom extends Room {

    public LivingRoom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
    }
    public LivingRoom(String roomName) {
        this(roomName,"");
    }

    Item[] items = new Item[] {new Item ("Люстра","Высоко висит"),
            new Item ("Кресло","Большое и мягкое"),
            new Item ("Ковёр","Простой ковёр"),
            new Item ("Магический стол","Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе")};
}
