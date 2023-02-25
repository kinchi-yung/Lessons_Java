public class Note extends Item implements Collectible, Useful{


    public Note(String name, String description) {
        super(name, description);
        text = getName()+getDescription();
    }
    Item note = new Note("Таинственная записка", "Не бойтесь использовать вещи по их прямому назначению");
    String text;
    @Override
    public void use() {
        System.out.println("Текст из записки: \""+text+"\"");
    }
}
