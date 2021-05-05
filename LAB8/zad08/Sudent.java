package pjatk.zad08;

public class Sudent implements Comparable{

    private final String name;
    private final String surname;
    private final String index;


    public Sudent(String name, String surname, String index) {
        this.name = name;
        this.surname = surname;
        this.index = index;
    }

    @Override
    public String toString() {
        return index + ","+ name +","+  surname + "\n";
    }
    @Override
    public int compareTo(final Object other) {
        final Sudent otherSudent = (Sudent) other;
        return this.index.compareTo(otherSudent.index);
    }




}
