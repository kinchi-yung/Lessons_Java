public abstract class Item {
    private String name;
    private String description;
    public static Item[] items;

   // public Item[] items = new Item[7];


    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

//    Object[] itemsBedroom = new Object[7];
//    Object[] itemsLivingroom = new Object[4];
//    Object[] itemsBathroom = new Object[4];
//    Object[] itemsKitchen = new Object[4];


}