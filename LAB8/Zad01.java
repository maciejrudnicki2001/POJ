package pjatk.pliki;
import java.io.File;
import java.io.IOException;
public class Zad01 {
    public static void main(String[] args) throws IOException{
        File file = new File("cos.txt");
        file.createNewFile();

        boolean fileExtist = file.exists();
        System.out.println(file.getAbsolutePath());

        File directory = new File("katalog");
        directory.mkdir();

        System.out.println(directory.isFile());
        System.out.println(directory.isDirectory());


    }

}
