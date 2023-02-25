public class LivingRoom extends Room {

    Item[] items = new Item[4];

    public LivingRoom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
        Item[] items = new Item[]{new Item("Люстра", "Высоко висит"),
                new Item("Кресло", "Большое и мягкое"),
                new Item("Ковёр", "Простой ковёр"),
                new Item("Магический стол", "Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе")};

    }

    public LivingRoom(String roomName) {
        this(roomName, "");
        Item[] items = new Item[]{new Item("Люстра", "Высоко висит"),
                new Item("Кресло", "Большое и мягкое"),
                new Item("Ковёр", "Простой ковёр"),
                new Item("Магический стол", "Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе")};

    }


    @Override
    public void printItems() {

        if (items.length > 0) {
            for (Item s : items) {
                System.out.println("Предметы в комнате " + getRoomName() + ": " + s.getName());
                return;
            }
        } else {
        }
    }
}
