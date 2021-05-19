package pjatk.l10_task2;

public class Main {
    public static void main(String[] args) {
        final Student student = new Student();
        student.addGrade(2.0);
        student.addGrade(3.0);
        student.addGrade(4.0);
        student.addGrade(5.0);
        System.out.println(student.getAvgGrade());
    }
}
