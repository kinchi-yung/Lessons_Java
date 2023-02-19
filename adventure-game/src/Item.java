

public class Item {
    private String name;
    private String description;

    public Item() {
        System.out.println("У предмета должно быть своё название и описание!");
    }

    public Item(String name, String description) {

        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("У предмета должно быть хотя бы имя");
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }


    static class Rooms {
        private String roomName;
        private String roomDescription;
        public Rooms() {
            System.out.println("Дайте название комнате");
        }

        public Rooms(String roomName, String roomDescription) {
            this.roomName = roomName;
            this.roomDescription = roomDescription;
        }

        public Rooms(String roomName) {
            new Rooms();
            roomDescription = "";
        }

        public void setRoomName(String roomName) {
            if (roomName.isEmpty()) {
                System.out.println("У комнаты должно быть хотя бы имя");
            } else {
                this.roomName = roomName;
            }
        }
        public String getRoomName() {
            return roomName;
        }

        public void setRoomDescription(String roomDescription) {
            this.roomDescription=roomDescription;
        }
        public String getRoomDescription() {
            return roomDescription;
        }

    }
}

//    public Item(String name, String description) { this.name = name; this.description = description; }
//
//public Item(String name) { this(name, ""); } }