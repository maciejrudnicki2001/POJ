package pjatk.person;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        boolean personCreat = false;

        while(!personCreat){
            System.out.println("Provide person data");

            System.out.println("Person first name:");
            final String firstName = scanner.nextLine();
            System.out.println("Person last name:");
            final String lastName = scanner.nextLine();
            System.out.println("Person birthday:");
            final String birth = scanner.nextLine();

            try{
                final Person person = new Person(firstName,lastName,birth);
                System.out.println(person.toString());
                personCreat = true;
            } catch (final Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
