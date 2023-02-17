


public class Bedroom {
    private String name = "Спальня";
    private String description = "";

    Item[] items = new Item[7];

    Item mirror = new Item("Зеркало", "Простое зеркальце на прикроватной тумбе");
    Item bed = new Item("Кровать", "На ней я сплю. Большая и любимая");
    Item window = new Item("Окно", "Совсем новое. Из него видно улицу с третьего этажа");
    Item closet = new Item("Шкаф", "Шкаф в котором храню одежду");
    Item door = new Item("Дверь", "Выход и спальни");
    Item table = new Item("Стол", "За ним я ем, работаю, отдыхаю");
    Item phone = new Item("Обычный смартфон", "Такой сейчас есть у каждого");

    Item[0] = "mirror";

    add(Item items[], mirror);


}
//    To add an object to an existing array of objects in Java, you can use the Arrays class and its static method add(Object[] array, Object element). Here's an example:
//
//        Object[] myArray = new Object[2]; myArray[0] = "Hello"; myArray[1] = "World";
//
//        Object element = "!"; Object[] newArray = Arrays.add(myArray, element);
//
//        System.out.println(Arrays.toString(newArray)); // Output: [Hello, World, !]