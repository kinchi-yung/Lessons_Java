import java.util.Objects;

public class Bedroom extends Room {

    public Bedroom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);

    }

    public Bedroom(String roomName) {
        this(roomName, "");

    }

//    public class IPhone extends Item implements Collectible{
//        public IPhone(String name, String description) {
//            super(name, description);
//        }
//    }
//    public class Bed extends Item implements Useful{
//        public Bed(String name, String description) {
//            super(name, description);
//        }
//
//        @Override
//        public void use() {
//        }
//    }
//    public class Mirror extends Item implements Useful{
//        public Mirror(String name, String description) {
//            super(name, description);
//        }
//
//        @Override
//        public void use() {
//        }
//    }
    public class Table extends Item implements Useful{
        public Table(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }
//    public class Shkaf extends Item implements Useful{
//        public Shkaf(String name, String description) {
//            super(name, description);
//        }
//
//        @Override
//        public void use() {
//        }
//    }
//    Item[] items = new Item[]{
//      new Table("Стол", "За ним я ем, работаю, отдыхаю."),
//      new Mirror("Зеркало", "Простое зеркальце на прикроватной тумбе.") ,
//      new Bed("Кровать", "На ней я сплю. Большая и любимая."),
//      new IPhone("Обычный смартфон", "Такой сейчас есть у каждого."),
//      new Shkaf("Шкаф", "Шкаф в котором храню одежду.")
//    };

    Item.Array arr = new Item.Array(5);

    Item table = new Table("f","f");


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
