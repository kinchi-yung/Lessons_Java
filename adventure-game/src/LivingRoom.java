public class LivingRoom extends Room {

    public LivingRoom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
    }

    public LivingRoom(String roomName) {
        this(roomName, "");
    }

    //    public class itemsLivingRoomC extends Item implements Collectible {
//        public itemsLivingRoomC(String name, String description) {
//            super(name, description);
//        }
//        Item kover = new itemsLivingRoomC("Ковёр", "Простой ковёр");
//    }
//
//    public class itemsLivingRoomU extends Item implements Useful {
//        public itemsLivingRoomU(String name, String description) {
//            super(name, description);
//        }
//        Item lystra = new itemsLivingRoomU("Люстра", "Высоко висит");
//        Item kreslo = new itemsLivingRoomU("Кресло", "Большое и мягкое");
//        Item magicTable = new itemsLivingRoomU("Магический стол", "Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе");
//
//
//        @Override
//        public void use() {
//
//        }
//    }
    public class Kover extends Item implements Collectible {
        public Kover(String name, String description) {
            super(name, description);
        }
        //Item kover = new Kover("Ковёр", "Простой ковёр");
    }

    public class Lystra extends Item implements Useful {
        public Lystra(String name, String description) {
            super(name, description);
        }
        //Item lystra = new Lystra("Люстра", "Высоко висит");

        @Override
        public void use() {
        }
    }

    public class Kreslo extends Item implements Useful {
        public Kreslo(String name, String description) {
            super(name, description);
        }
        //Item kreslo = new Kreslo("Кресло", "Большое и мягкое");

        @Override
        public void use() {
        }
    }

    public class MagicTable extends Item implements Useful {
        public MagicTable(String name, String description) {
            super(name, description);
        }
        //Item magicTable = new MagicTable("Магический стол", "Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе");

        @Override
        public void use() {
        }
    }


    Item[] LivingRoomItems = new Item[]{
            new MagicTable("Магический стол", "Стол в углу комнаты в алой раскраске, возможно владелец немного не в себе"),
            new Kreslo("Кресло", "Большое и мягкое"),
            new Lystra("Люстра", "Высоко висит"),
            new Kover("Ковёр", "Простой ковёр")
    };


    @Override
    public void printItems() {

        if (LivingRoomItems.length > 0) {
            for (Item s : LivingRoomItems) {
                System.out.println("Предметы в комнате " + getRoomName() + ": " + s.getName());
                return;
            }
        } else {
            System.out.println("В комнате нет вещей");
        }
    }
}
