public class Bathroom extends Room {

    Item[] items = new Item[4];

    public Bathroom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
        Item[] items = new Item[]{new Item("Полотенце", "Простое полотенце"),
                new Item("Средство для укладки волос", "Таким пользуются для придания нужной формы причёске"),
                new Item("Туалетная бумага", "Поднимет боевой дух кота"),
                new Item("Лоток", "Находится рядом с человеческим")};

    }

    public Bathroom(String roomName) {
        this(roomName, "");
        Item[] items = new Item[]{new Item("Полотенце", "Простое полотенце"),
                new Item("Средство для укладки волос", "Таким пользуются для придания нужной формы причёске"),
                new Item("Туалетная бумага", "Поднимет боевой дух кота"),
                new Item("Лоток", "Находится рядом с человеческим")};

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
