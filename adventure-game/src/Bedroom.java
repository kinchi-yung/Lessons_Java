import java.util.Objects;

public class Bedroom extends Room {

    public Bedroom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
        items = new Item[4];
        items[0] = new IPhone ("Простой смартфон"," Такой есть у каждого");
        items[1] = new Bed ("Кровать","");
        items[2] = new Table ("Стол","");
        items[3] = new Furniture ("Шкаф"," Разная мебель","Может помочь");
    }

    public Bedroom(String roomName) {
        this(roomName, "");
        items = new Item[4];
        items[0] = new IPhone ("Простой смартфон"," Такой есть у каждого");
        items[1] = new Bed ("Кровать","");
        items[2] = new Table ("Стол","");
        items[3] = new Furniture ("Шкаф"," Разная мебель","Может помочь");
    }

    public class IPhone extends Item implements Collectible {
        public IPhone(String name, String description) {
            super(name, description);
        }
    }

    public class Bed extends Item implements Useful {
        public Bed(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
            System.out.println("Вы вспомнили что сегодня выходной и вернулись ко сну!");
            Game.isGameFinished = true;
        }
    }

    public class Table extends Item implements Useful {
        public Table(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
            System.out.println("Вы кушали не торопяс и заметили что сегодня выходной!");
            Game.isGameFinished = true;
        }
    }

    public class Furniture extends Item implements  Useful{
        String text;
        public Furniture(String name, String description, String text) {
            super(name, description);
            this.text = text;
        }
        @Override
        public void use() {
            System.out.println(text);
        }
    }


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
