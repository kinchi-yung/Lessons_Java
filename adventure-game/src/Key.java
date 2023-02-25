public class Key extends Item implements Collectible, Useful {

    public Key(String name, String description) {
        super(name, description);
    }

    Item keyFR = new Key("Старинный ключ", "???");
    Item keyy = new Key("Старинный ключ", "???");


    @Override
    public void use() {
        if (keyy.equals(keyFR)) {
            Game.isGameFinished = true;
        }else{
            System.out.println("Ничего не произошло");
        }
    }
}
