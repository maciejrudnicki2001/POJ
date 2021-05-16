package pjatk.task1;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new int[]{});

        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(7);
        myList.add(23);

        System.out.println(myList.contains(2));
        System.out.println(myList.size());
        System.out.println(myList.indexOf(23));
        System.out.println(myList.get(3));
        myList.set(3,23);
        System.out.println(myList.indexOf(23));

    }
}
