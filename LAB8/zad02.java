package pjatk.pliki;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class zad02 {
    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");

        Stream<String> linesFromFile = Files.lines(Paths.get(input.toString()));
        List<String> listOfLines = linesFromFile.collect(Collectors.toList());

        for (int i = 0; i < listOfLines.size(); i++){
            String line = listOfLines.get(i);
            System.out.println(line);
            String patten = "\\d+";
            boolean isNumber = line.matches(patten);
            System.out.println(line + " " + isNumber);

            String pattern3 = "([0-9]+[* | \\-|/+]*)+"; //sprawdza czy linia jest działaniem
            boolean isEquation = line.matches(pattern3);
            System.out.println(line+ ""+isEquation);
        }
    }



}
