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
            System.out.println("Открыв холодильник ты плотно покушал и решил что работа подождёт уснув на диване.");
        }
    }

    public class Dishes extends Item implements Collectible {
        public Dishes(String name, String description) {
            super(name, description);
        }
    }

    Item fridge = new Fridge ("Холодильник","Вместительный");

    Item[] items = new Item[4];
    items[0] = fridge;
//    items[1] = new ("","");
//    items[2] = new ("","");
//    items[3] = new ("","");
    @Override
    public void addItems(Object item, int index) {
        super.addItems(item, index);
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

