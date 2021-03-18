//zadanie_pierwsze
package pjatk;



public class pr_1 {
    private static final double CE_TO_KE = 273.15;

    public static void main(String[] args) {
        System.out.println("Celsius   Kelvin");
        for (int i = 1; i <= 10; i++) {
            double km = i + CE_TO_KE;
            System.out.println(i + "\t\t" + km);

        }
    }
}
//zadanie_drugie
package pjatk;

import java.util.Scanner;

public class pr_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch(month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Nie oszukuj pls...");
                break;
        }

    }
}
//zadanie_trzecie
package pjatk;

import java.util.Scanner;
public class pr_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilu studentów: ");
        int nos = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Imie ");
        String name = scanner.nextLine();
        System.out.println("Punkty: ");
        int points = scanner.nextInt();
        for( int i = 0; i < nos - 1; i++) {
            scanner.nextLine();
            System.out.println("Imie: ");
            String name1 = scanner.nextLine();


            System.out.println("Punkty: ");
            int points1 = scanner.nextInt();

            if(points <points1)
            {
                name = name1;
                points = points1;
            }
        }
        System.out.println("Najlepszy student: " + name + " "+points);
    }
}
//zadanie_czwarte
package pjatk;

import java.util.Scanner;

public class pr_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a > b && a > c) {
            System.out.println(a);
            if (b > c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        }
        if (b > a && b > c) {
            System.out.println(b);
            if (a > c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
                }
            }
        if (c > a && c > b) {
            System.out.println(c);
            if (b > a) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        }

    }
}
//zadanie_piate
package pjatk;
import java.util.Random;
import java.util.Scanner;
public class pr_5 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int losowanie;
        String wybor;



        System.out.println("Wpisz 0 (papier), 1 (kamień) lub 2 (nożyce).");

        String wynik;
        wybor = scan.nextLine();
        int liczba = Integer.parseInt(wybor);

        losowanie = rnd.nextInt(4) + 1;

        if (liczba == 0 || liczba == 1 || liczba == 2) {

            if (liczba == 0) {
                System.out.println("Twój wybór to: papier.");
            } else if (liczba == 1) {
                System.out.println("Twój wybór to: kamień.");
            } else {
                System.out.println("Twój wybór to: nożyce.");
            }


            if (losowanie == 0) {
                System.out.println("Wylosowano \"papier\".");

                if (liczba == 2) {
                    System.out.println("Wygrana!!!");
                    wynik = "wygrana";
                } else if (liczba == 1) {
                    System.out.println("Przegrana :(");
                    wynik = "przegrana";
                } else {
                    System.out.println("Remis");
                    wynik = "remis";
                }
            } else if (losowanie == 1) {
                System.out.println("Wylosowano \"kamień\".");

                if (liczba == 0) {
                    System.out.println("Wygrana!!!");
                    wynik = "wygrana";
                } else if (liczba == 2) {
                    System.out.println("Przegrana :(");
                    wynik = "przegrana";
                } else {
                    System.out.println("Remis");
                    wynik = "remis";
                }

            } else {
                System.out.println("Wylosowano \"nożyce\".");

                if (liczba == 1) {
                    System.out.println("Wygrana!!!");
                    wynik = "wygrana";
                } else if (liczba == 0) {
                    System.out.println("Przegrana :(");
                    wynik = "przegrana";
                } else {
                    System.out.println("Remis");
                    wynik = "remis";
                    }
            }
            } else {
                System.out.println("Wybrano wartość spoza zakresu! Uruchom jeszcze raz");

            }


        }


}
