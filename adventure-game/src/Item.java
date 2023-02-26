public abstract class Item {
    private String name;
    private String description;

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

    Object[] itemsBedroom = new Object[7];
    Object[] itemsLivingroom = new Object[4];
    Object[] itemsBathroom = new Object[4];
    Object[] itemsKitchen = new Object[4];

        //BEDROOM
//    public Object[] getItemsBedroom() {
//        return itemsBedroom;
//    }

    //BATHROOM
//    itemsBathroom = new Object("","");
        //LIVIGROOM
        //KITCHIEN
}

//public abstract class ArrayClass {
//
//    Object[] array = new Object[5];
//
//    public ArrayClass(){
//        array[0] = new Object();
//        array[1] = new Object();
//        array[2] = new Object();
//        array[3] = new Object();
//        array[4] = new Object();
//    }
//}