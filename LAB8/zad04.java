package pjatk.pliki;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class zad04 {
    public static void main(String[] args) throws IOException {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        File out = new File("out.txt");
        out.createNewFile();
        int counter = 0;
        while (counter < 100){
           localDate = localDate.plusYears(1);
            if (localDate.isLeapYear()){
                counter++;
                System.out.println(localDate);
                String outString = localDate.toString() + "\n";
                Files.write(out.toPath(), outString.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            }
        }

    }
}
