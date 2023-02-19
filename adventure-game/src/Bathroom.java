public class Bathroom {
    private String roomName;
    private String roomDescription;

    public Bathroom(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }
    public Bathroom(String roomName) {
        this(roomName,"");
    }

    Item[] items = new Item[] {new Item ("Полотенце","Простое полотенце"),
            new Item ("Средство для укладки волос","Таким пользуются для придания нужной формы причёске"),
            new Item ("Туалетная бумага","Поднимет боевой дух кота"),
            new Item ("Лоток","Находится рядом с человеческим")};
}
