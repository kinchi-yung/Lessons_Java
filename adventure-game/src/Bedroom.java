


public class Bedroom {

    //Item.Rooms Bedroom = new Item.Rooms("Спальня");
    /* Почему когда я писал эту строку тут оно не работало?
    * это из-за того что тут не было метода мейн который приводил в действие создание объекта?*/

    public static void main(String[] args) {
        //Item.Rooms Bedroom = new Item.Rooms("Спальня");  //тут работает
        Item[] items = new Item[]{new Item("Зеркало", "Простое зеркальце на прикроватной тумбе."),
                new Item("Кровать", "На ней я сплю. Большая и любимая."),
                new Item("Окно", "Совсем новое. Из него видно улицу с третьего этажа."),
                new Item("Шкаф", "Шкаф в котором храню одежду."),
                new Item("Дверь", "Выход и спальни."),
                new Item("Стол", "За ним я ем, работаю, отдыхаю."),
                new Item("Обычный смартфон", "Такой сейчас есть у каждого.")};
        for (Item s : items) {
            System.out.println(s);
        }
        System.out.println(items[1].getName());
        System.out.println(items[1].getDescription());
        //System.out.println(Bedroom.getRoomName());
    }

}