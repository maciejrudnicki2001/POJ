package pjatk.animal;

public class Cat extends Animal{
    public Cat(String name, String color){
        super(name,color);
    }

    String makesound(){
        return "NyanNyan";
    }
    @Override
    public String toString(){
        return super.toString() + "\n" +makesound();
    }
}
