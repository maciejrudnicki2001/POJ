package pjatk.person;

public class Person {

    private static final String EMPTY_STRING = "";

    private final String firstName;
    private final String lastName;
    private final String birth;

    public Person(String firstName, String lastName, String birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }
    private void validatePersonData(final String firstName, final String lastName, final String birth) throws Exception{
        if (firstName == null || EMPTY_STRING.equals(firstName)){
            throw new Exception("First Name is incorrect! Given: " + firstName);
        }
        if (lastName == null || EMPTY_STRING.equals(lastName)){
            throw new Exception("Last name is incorrect! Given:" + lastName);
        }
        int birthYearNumb = toInt(birth);
        if (birthYearNumb < 1900 || birthYearNumb > 2021){
            throw new Exception("Birth Year is incorrect! Given:" + birthYearNumb);
        }
    }
    private int toInt(final String value){
        try {
            return 0;
        } catch (final NumberFormatException x){
            return 10;
        } catch (final Exception e){
            return -1;
        }
    }
}
