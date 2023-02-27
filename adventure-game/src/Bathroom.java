public class Bathroom extends Room {
    public Bathroom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);

    }
    public Bathroom(String roomName) {
        this(roomName, "");

    }

    public class ToiletPaper extends Item implements Collectible{
        public ToiletPaper(String name, String description) {
            super(name, description);
        }
    }
    public class Towel extends Item implements Useful{
        public Towel(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }
    public class Lotok extends Item implements Useful{
        public Lotok(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }
    public class KremHair extends Item implements Useful{
        public KremHair(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    Item[] BathRoomItems = new Item[]{
            new Lotok ("Лоток", "Находится рядом с человеческим"),
            new Towel ("Полотенце", "Простое полотенце"),
            new ToiletPaper ("Туалетная бумага", "Поднимет боевой дух кота"),
            new KremHair ("Средство для укладки волос", "Таким пользуются для придания нужной формы причёске")
    };

    @Override
    public void printItems() {

        if (BathRoomItems.length > 0) {
            for (Item s : BathRoomItems) {
                System.out.println("Предметы в комнате " + getRoomName() + ": " + s.getName());
                return;
            }
        } else {
            System.out.println("В комнате нет вещей");
        }
    }
}
