public class Bathroom extends Room {
    public Bathroom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);

    }

    public Bathroom(String roomName) {
        this(roomName, "");

    }

    public class ToiletPaper extends Item implements Collectible {
        public ToiletPaper(String name, String description) {
            super(name, description);
        }
    }

    public class Towel extends Item implements Useful {
        public Towel(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    public class Note extends Item implements  Useful, Collectible{
        String text;
        public Note (String name, String description, String text) {
            super(name, description);
            this.text = text;
        }
        @Override
        public void use() {
            System.out.println("Текст записки: " + "\""+text+"\"");
        }
    }

    public class KremHair extends Item implements Useful {
        public KremHair(String name, String description) {
            super(name, description);
        }

        @Override
        public void use() {
        }
    }

    public Bathroom() {
        items = new Item[4];
        items[0] = new ToiletPaper("Туалетная бумага", "");
        items[1] = new Towel("Полотенце", "");
        items[2] = new Note("Стикер на стекле", "","Напоминание про ключи");
        items[3] = new KremHair("Крем для волос", "");
    }

    @Override
    public void printItems() {
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println("Предметы в комнате " + getRoomName() + ": " + item.getName()+item.getDescription());
                return;
            }
        } else {
            System.out.println("В комнате нет вещей");
        }
    }
}
