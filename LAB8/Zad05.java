package pjatk.pliki;

import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;
import java.time.LocalDate;
public class Zad05 {

    public static void main(String[] args)  {


        final TimeZone poland = TimeZone.getTimeZone("Poland");
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours:");
        int hours = scanner.nextInt();
        System.out.println(hours);
        System.out.print("Enter minutes:");
        int minutes = scanner.nextInt();
        System.out.println(minutes);

        final Calendar calendar = Calendar.getInstance();
        final LocalDate today = LocalDate.now();
        calendar.setTimeZone(poland);
        calendar.set(today.getYear(), today.getMonthValue(), today.getDayOfMonth());
        System.out.println("And now choose TimeZone: \n 1 - Copenhagen \n 2 - Mexico \n 3 - Singapore");
        int i = scanner.nextInt();
        if (i == 1) {
            hours = hours;
            System.out.println("\n"+ hours +":" + minutes);
        } else if (i == 2) {
            hours = hours - 8;
            if (hours < 0){
                hours = 24 - hours;
            }
            System.out.println("\n"+ hours +":" + minutes);
        } else if (i == 3) {
            hours = hours + 8;
            if (hours > 24){
                hours = hours - 24;

            }
            System.out.println("\n"+ hours +":" + minutes);
        }
        else{
            System.out.println("Niepoprawna liczba!");
        }

        System.out.printf("%s-%s-%s", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE ));

    }
}
