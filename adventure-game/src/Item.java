

public class Item {
    private String name;
    private String description;
    private String roomName;
    private String roomDesc;

    static void Item() {
        System.out.println("У предмета должно быть своё название и описание!");
    }
    Item(String name, String description) {

        this.name = name;
        this.description = description;
    }
    void rooms() {
        System.out.println("Дайте название комнате");
    }

    void rooms(String roomname, String roomdescription) {
        this.roomName = roomname;
        this.roomDesc = roomdescription;
    }

    void rooms(String name) {
        rooms();
        roomDesc = "";
    }

}

//public Item(String name, String description) { this.name = name; this.description = description; }
//public Item(String name) { this(name, ""); }
//public class Item { String name; String description;
//    public Item(String name, String description) { this.name = name; this.description = description; }
//
//public Item(String name) { this(name, ""); } }