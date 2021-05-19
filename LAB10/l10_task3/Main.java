package pjatk.l10_task3;

import pjatk.l10_task2.Student;

public class Main {
    public static void main(String[] args) {
        //te pjatk.l10_task3 musiałem wpisać, ponieważ kolidowało mi z funkcją z tasku 2, z góry przepraszam
        final pjatk.l10_task3.Student student = new pjatk.l10_task3.Student();
        student.addGrade("POJ", 2.0);
        student.addGrade("POJ", 3.0);
        student.addGrade("POJ", 3.0);
        student.addGrade("POJ", 2.0);
        student.addGrade("WPR",3.0);
        student.addGrade("RBD",4.0);
        student.addGrade("NWM", 5.0);
        System.out.println(student.getAvgGrade("POJ"));
    }
}
