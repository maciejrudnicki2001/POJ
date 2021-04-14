package pjatk.human;

public class Main {
    public static void main(String[] args) {
        final Human human = new Human("Superman", 33);
        final Human superHuman = new SuperHuman("Superman", 33,"Fly");

        System.out.println(human==superHuman);
        System.out.println(human.hashCode()==superHuman.hashCode());
        System.out.println(human.equals(superHuman));
        System.out.println(superHuman.equals(human));

    }
}
