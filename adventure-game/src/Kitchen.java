public class Kitchen extends Room {
    public Kitchen(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
    }

    public Kitchen(String roomName) {
        this(roomName, "");
    }

    public class CrowBar extends Item implements Collectible {
        public CrowBar(String name, String description) {
            super(name, description);
        }
    }

    public class SharpKnife extends Item implements Collectible {
        public SharpKnife(String name, String description) {
            super(name, description);
        }
    }

    public class Fridge extends Item implements Useful {
        public Fridge(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    public class Dishes extends Item implements Useful {
        public Dishes(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }


    Item[] KitchenRoomItems = new Item[]{
        new SharpKnife("Нож", "Очень острый, режет даже материю"),
        new Dishes("Кострюли", "Набор поварских кострюль для готовки"),
        new CrowBar("Монтировка", "Просто стоит за холодильком"),
        new Fridge("Холодильник", "В нём хранится еда")
    };



    @Override
    public void printItems() {

        if (KitchenRoomItems.length > 0) {
            for (Item s : KitchenRoomItems) {
                System.out.println("Предметы в комнате " + getRoomName() + ": " + s.getName());
                return;
            }
        } else {
        }
    }
}

