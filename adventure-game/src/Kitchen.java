public class Kitchen extends Room {

    Item[] items = new Item[4];

    public Kitchen(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
        Item[] items = new Item[]{new Item("Холодильник", "В нём хранится еда"),
                new Item("Нож", "Очень острый, режет даже материю"),
                new Item("Монтировка", "Просто стоит за холодильком"),
                new Item("Кострюли", "Набор поварских кострюль для готовки")};

    }

    public Kitchen(String roomName) {
        this(roomName, "");
        Item[] items = new Item[]{new Item("Холодильник", "В нём хранится еда"),
                new Item("Нож", "Очень острый, режет даже материю"),
                new Item("Монтировка", "Просто стоит за холодильком"),
                new Item("Кострюли", "Набор поварских кострюль для готовки")};

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

