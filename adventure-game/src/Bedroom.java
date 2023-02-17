


public class Bedroom {
    private String name = "Спальня";
    private String description = "";

    public static void main(String[] args) {
        Item[] items = new Item[]{new Item("Зеркало", "Простое зеркальце на прикроватной тумбе"),
                new Item("Кровать", "На ней я сплю. Большая и любимая"),
                new Item("Окно", "Совсем новое. Из него видно улицу с третьего этажа"),
                new Item("Шкаф", "Шкаф в котором храню одежду"),
                new Item("Дверь", "Выход и спальни"),
                new Item("Стол", "За ним я ем, работаю, отдыхаю"),
                new Item("Обычный смартфон", "Такой сейчас есть у каждого")};
        for (Item s : items) {
            System.out.println(s);
        }
        System.out.println(items[1].name);
    }
}

//    To add an object to an existing array of objects in Java, you can use the Arrays class and its static method add(Object[] array, Object element). Here's an example:
//
//        Object[] myArray = new Object[2]; myArray[0] = "Hello"; myArray[1] = "World";
//
//        Object element = "!"; Object[] newArray = Arrays.add(myArray, element);
//
//        System.out.println(Arrays.toString(newArray)); // Output: [Hello, World, !]