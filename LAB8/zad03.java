package pjatk.pliki;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class zad03 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("src/pjatk/pliki/values_ex3.txt"));
        String lines = reader.readLine();
        int currentSum = 0;
        while(lines != null){
            //Kompletnie nie wiem dlaczego się dodaje 48 pewnie chodzi o Ascii ale nvm działa
            int i = 0;
            while (i < lines.length()){
                currentSum = currentSum + lines.charAt(i)-48;
                i = i + 2;
            }
            lines = reader.readLine();

        }
        System.out.println(currentSum);

    }
}
