public abstract class Item {
    private String name;
    private String description;

    //private Item[] items;


    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }
   // public abstract void use();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }



//    public static class Array {
//        //private  Object[] objectArray;
//        private  Object[] objectArray;
//
//        public  Array(int size){
//            objectArray=new Object[size];
//        }
//
//        public void addObject(Object object, int index){
//            objectArray[index]=object;
//        }
//    }

}