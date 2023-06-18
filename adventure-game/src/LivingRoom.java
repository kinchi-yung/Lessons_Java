public class LivingRoom extends Room {
    public LivingRoom(String roomName, String roomDescription) {
        setRoomName(roomName);
        setRoomDescription(roomDescription);
            items = new Item[4];
            items[0] = new Kover ("Ковёр","");
            items[1] = new Lystra ("Люстра","");
            items[2] = new Key ("Старинный ключ","","Открывает двери");
            items[3] = new MagicTable ("Стол загадка","");
    }

    public LivingRoom(String roomName) {
        this(roomName, "");
        items = new Item[4];
        items[0] = new Kover ("Ковёр","");
        items[1] = new Lystra ("Люстра","");
        items[2] = new Key ("Старинный ключ","","Открывает двери");
        items[3] = new MagicTable ("Стол загадка","");

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

    public class Key extends Item implements  Useful, Collectible{
        String text;
        public Key(String name, String description, String text) {
            super(name, description);
            this.text = text;
        }
        String keyWord = "Старинный ключ";
        @Override
        public void use() {
//            if (keyWord.equals((getName(Key))){
//                isGameFinished = true;
//            }else{
//                System.out.println("Ничего не произошло");
//            }
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
