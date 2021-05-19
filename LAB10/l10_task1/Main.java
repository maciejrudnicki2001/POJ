package pjatk.l10_task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(wordsCount("Pisze to o 3:12 rano , więc no no , chce już spać XD"));
    }
    public static Map<String, Integer> wordsCount(String sentence){
        String[] split = sentence.split(" ");
        Map<String, Integer> words = new HashMap<>();
        for (String word : split){
            words.compute(word, (slot, how_many) -> how_many == null ? 1 : how_many+1);
        }
        return words;
    }
}
