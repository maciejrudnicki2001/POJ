package pjatk.mark_change;

public class Main {
    public static void main(final String[] args) {
        StringTransformer newStrings = new StringTransformer();
        System.out.println(">>> removeSigns");
        System.out.println(newStrings.removeSigns("123 Testo wanie", Sign.NUMBER));
        System.out.println(newStrings.removeSigns("123 Testo wanie", Sign.SPACE));
        System.out.println(newStrings.removeSigns("123 Testo wanie", Sign.VOWEL));
        System.out.println(newStrings.removeSigns("123 Testo wanie", Sign.CONSONANT));
        System.out.println(">>> replaceSigns");
        System.out.println(newStrings.replaceSigns("123 Testo wanie", Sign.NUMBER, "#"));
        System.out.println(newStrings.replaceSigns("123 Testo wanie", Sign.SPACE, "#"));
        System.out.println(newStrings.replaceSigns("123 Testo wanie", Sign.VOWEL, "#"));
        System.out.println(newStrings.replaceSigns("123 Testo wanie", Sign.CONSONANT, "#"));
        System.out.println(">>> preserveSigns");
        System.out.println(newStrings.preserveSigns("123 Testo wanie", Sign.NUMBER));
        System.out.println(newStrings.preserveSigns("123 Testo wanie", Sign.SPACE));
        System.out.println(newStrings.preserveSigns("123 Testo wanie", Sign.VOWEL));
        System.out.println(newStrings.preserveSigns("123 Testo wanie", Sign.CONSONANT));
    }
}
