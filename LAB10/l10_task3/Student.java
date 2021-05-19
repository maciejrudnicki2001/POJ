package pjatk.l10_task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private Map<String , List<Double>> grades = new HashMap<>();

    public void addGrade(String lesson, Double grade){
        this.grades.computeIfAbsent(lesson, mark -> new ArrayList<>());
        this.grades.get(lesson).add(grade);
    }
    public double getAvgGrade(String lesson){
        try {
            double sum = 0;
            int i = 0;
            while (i < grades.get(lesson).size()) {
                sum = sum + grades.get(lesson).get(i);
                i++;
            } return sum / grades.size();

        } catch(NullPointerException f){
            return 0;
        }
}}
