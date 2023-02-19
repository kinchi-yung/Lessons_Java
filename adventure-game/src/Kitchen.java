public class Kitchen {
    private String roomName;
    private String roomDescription;
    public Kitchen(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }
    public Kitchen(String roomName) {
        this(roomName,"");
    }

    Item[] items = new Item[] {new Item ("Холодильник","В нём хранится еда"),
            new Item ("Нож","Очень острый, режет даже материю"),
            new Item ("Монтировка","Просто стоит за холодильком"),
            new Item ("Кострюли","Набор поварских кострюль для готовки")};
}
