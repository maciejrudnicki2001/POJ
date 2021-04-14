package pjatk.animal;

public class Dog extends  Animal{
    public Dog(String name, String color){
        super(name, color);
    }
    String makesound(){
        return "WoofWoof";
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+this.makesound();
    }
}
