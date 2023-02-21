public class Bathroom extends Room {

    public Bathroom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
    }
    public Bathroom(String roomName) {
        this(roomName,"");
    }

    Item[] items = new Item[] {new Item ("Полотенце","Простое полотенце"),
            new Item ("Средство для укладки волос","Таким пользуются для придания нужной формы причёске"),
            new Item ("Туалетная бумага","Поднимет боевой дух кота"),
            new Item ("Лоток","Находится рядом с человеческим")};
}
