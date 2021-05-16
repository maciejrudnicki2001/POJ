package pjatk.task3;

public class Main {
    public static void main(String[] args) {
        final Integer[] ints = new Integer[] {3,2,1,6,5,4,9,8,43,21,37};
        final String[] strings = new String[] {"Aka","ma","kota","a","ja","NIe","mam","KOTA","i","ŻyCiE"};
        System.out.println(findMaximum(ints));
        System.out.println(findMaximum(strings));
    }
    public static <F extends Comparable> F findMaximum(final F[] array) {
        if (array.length < 1){
            return array[0];
        }
        F biggestValue = array[0];
        for (F element : array){
            if (element.compareTo(biggestValue) > 0) {
                biggestValue = element;
            }
        }
        return biggestValue;
    }
}

