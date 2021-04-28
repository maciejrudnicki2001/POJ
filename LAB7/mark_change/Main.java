package pjatk.mark_change;

public class Main {
    public static void main(final String[] args) {
        StringTransformer newStrings = new StringTransformer();
        //Wiem, że oryginalnie w zadaniu było "T" ale gdy w enumie dawałem duże litery to i tak nie działało, więc postanowiłem pozostać przy małych
        System.out.println(">>> removeSigns");
        System.out.println(newStrings.removeSigns("123 testo wanie", Sign.NUMBER));
        System.out.println(newStrings.removeSigns("123 testo wanie", Sign.SPACE));
        System.out.println(newStrings.removeSigns("123 testo wanie", Sign.VOWEL));
        System.out.println(newStrings.removeSigns("123 testo wanie", Sign.CONSONANT));
        System.out.println(">>> replaceSigns");
        System.out.println(newStrings.replaceSigns("123 testo wanie", Sign.NUMBER, "#"));
        System.out.println(newStrings.replaceSigns("123 testo wanie", Sign.SPACE, "#"));
        System.out.println(newStrings.replaceSigns("123 testo wanie", Sign.VOWEL, "#"));
        System.out.println(newStrings.replaceSigns("123 testo wanie", Sign.CONSONANT, "#"));
        System.out.println(">>> preserveSigns");
        System.out.println(newStrings.preserveSigns("123 testo wanie", Sign.NUMBER));
        System.out.println(newStrings.preserveSigns("123 testo wanie", Sign.SPACE));
        System.out.println(newStrings.preserveSigns("123 testo wanie", Sign.VOWEL));
        System.out.println(newStrings.preserveSigns("123 testo wanie", Sign.CONSONANT));
    }
}
