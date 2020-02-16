package programowanie2.lesson1.homework.farm.animals;

public class Chicken extends BirdAnimal {

    public Chicken(String skin, String name) {
        super(skin, name);
    }

    public Chicken(String name){
        super("piora", name);
    }

    public Chicken(){
        super("piora","kfc");
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    String getSound() {
        return "kokoko";
    }
}