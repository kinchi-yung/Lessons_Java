


public class Item {
    private String name;
    private String description;


    static void Item() {
        System.out.println("У предмета должно быть своё название и описание!");
    }

    Item(String name, String description) {

        this.name = name;
        this.description = description;
    }

    private String roomName;
    private String roomDesc;

    void rooms() {

    }

    void rooms(String name, String description) {
        this.roomName = name;
        this.roomDesc = description;
    }

    void rooms(String name) {
        rooms();

    }

}
