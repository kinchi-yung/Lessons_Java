public class Bedroom {

    private String roomName;
    private String roomDescription;

    public Bedroom(String roomName, String roomDescription) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
    }
    public Bedroom(String roomName) {
        this(roomName,"");
    }

    Item[] items = new Item[]{new Item("Зеркало", "Простое зеркальце на прикроватной тумбе."),
            new Item("Кровать", "На ней я сплю. Большая и любимая."),
            new Item("Окно", "Совсем новое. Из него видно улицу с третьего этажа."),
            new Item("Шкаф", "Шкаф в котором храню одежду."),
            new Item("Дверь", "Выход и спальни."),
            new Item("Стол", "За ним я ем, работаю, отдыхаю."),
            new Item("Обычный смартфон", "Такой сейчас есть у каждого.")};

}
