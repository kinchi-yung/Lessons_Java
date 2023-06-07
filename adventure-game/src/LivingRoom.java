public class LivingRoom extends Room {

    public LivingRoom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
    }

    public LivingRoom(String roomName) {
        this(roomName, "");
    }

    public class Kover extends Item implements Collectible {
        public Kover(String name, String description) {
            super(name, description);
        }
    }

    public class Lystra extends Item implements Useful {
        public Lystra(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    public class Kreslo extends Item implements Useful {
        public Kreslo(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    public class MagicTable extends Item implements Useful {
        public MagicTable(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    private Item[] items;

    public LivingRoom() {
        items = new Item[4];
        items[0] = new Kover ("Ковёр","");
        items[1] = new Lystra ("Люстра","");
        items[2] = new Kreslo ("Кресло","");
        items[3] = new MagicTable ("Стол загадка","");

    }


    @Override
    public void printItems() {

        if (items.length > 0) {
            for (Item s : items) {
                System.out.println("Предметы в комнате " + getRoomName() + ": " + s.getName());
                return;
            }
        } else {
            System.out.println("В комнате нет вещей");
        }
    }
}
