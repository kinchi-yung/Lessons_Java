


public class Item {
    private String name;
    private String description;


    static  void Item(){
        System.out.println("У предмета должно быть своё название и описание!");
    }

     Item(String name, String description) {

        this.name = name;
        this.description = description;
    }

}
