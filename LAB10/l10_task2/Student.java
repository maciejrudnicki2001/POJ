package pjatk.l10_task2;
import java.util.ArrayList;
import java.util.List;
public class Student {
    private final List<Double> grades = new ArrayList<>();

    public void addGrade(Double grade){
        this.grades.add(grade);
    }
    public double getAvgGrade(){
        double sum = 0;
        int i = 0;
        while(i < grades.size()) {
            sum = sum + grades.get(i);
            i++;
        }
        return sum/grades.size();
    }
}
