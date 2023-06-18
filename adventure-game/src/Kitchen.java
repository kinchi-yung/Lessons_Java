public class Kitchen extends Room {
    public Kitchen(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
        items = new Item[4]; // задаем размер массива размером 4
        items[0] = new Fridge("Холодильник", "Вместительный");
        items[1] = new Window("Окно", "","Можно вылезьти");
        items[2] = new SharpKnife("Нож", "");
        items[3] = new CrowBar("Ломик", "" );
    }

    public Kitchen(String roomName) {
        this(roomName, "");
        items = new Item[4]; // задаем размер массива размером 4
        items[0] = new Fridge("Холодильник", "Вместительный");
        items[1] = new Window("Окно", "","Можно вылезьти");
        items[2] = new SharpKnife("Нож", "");
        items[3] = new CrowBar("Ломик", "" );
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

    public class Window extends Item implements  Useful{
        String text;
        public Window(String name, String description, String text) {
            super(name, description);
            this.text = text;
        }
        @Override
        public void use() {
            System.out.println(text);
        }
    }

//    @Override
//    public void addItems(Object item, int index) {
//        super.addItems(item, index);
//    }



    @Override
    public void printItems() {
        if (items.length > 0) {
            System.out.println("Предметы в комнате "+ getRoomName() + ": ");
            for (Item item : items) {
                System.out.println(item.getName()+item.getDescription());
            }
        } else {
            System.out.println("В комнате нет вещей");
        }
    }
}

