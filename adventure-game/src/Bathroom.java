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

    private Item[] items;
    public Bathroom(){
        items = new Item[4];
        items[0] = new ToiletPaper ("Туалетная бумага","");
        items[1] = new Towel ("Полотенце","");
        items[2] = new Lotok ("Туалет для кота","с мягким песком");
        items[3] = new KremHair ("Крем для волос","");

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
