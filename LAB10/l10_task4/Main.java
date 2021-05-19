package pjatk.l10_task4;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        final List<Integer> ints = Arrays.asList(9,3,1,2,2,1,1,3,7,4,5,7,42);
        System.out.println(deleteReplies(ints));
    }

    public static <F> List<F> deleteReplies(final List<F> deleteReplies){
        return new ArrayList<>(new HashSet<F>(deleteReplies));
    }
}
