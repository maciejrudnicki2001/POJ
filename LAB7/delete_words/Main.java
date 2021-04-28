package pjatk.delete_words;
import java.util.Arrays;
public class Main {
    public static String arrayCreator (int value, String[] array) throws Exception {
        try{
            int slots = array.length / value;
        }
        catch (ArithmeticException a){
            throw new Exception("Dividing by zero is illegal m8");
        }
        int slots = array.length / value;
        String[] finalArray = new String[slots];
        int stringIntoArray = 0;
        int i = 0;
        while (i < slots){
            finalArray[stringIntoArray] = array[i];
            i = i + value;
            stringIntoArray++;
        }
        String sent = Arrays.toString(finalArray);
        return sent;
    }

    public static void main(String[] args) throws Exception {
        String[] sentence = {"Adam","poszedł","na","grzyby","i","spotkał","Rudnika","tak"};
        System.out.println(arrayCreator(1, sentence));

    }
}