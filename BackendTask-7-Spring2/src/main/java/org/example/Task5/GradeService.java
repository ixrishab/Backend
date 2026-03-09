package org.example.Task5;
import java.util.regex.Pattern;
public class GradeService {
    public boolean validateName(String name) {
        return Pattern.matches("[a-zA-Z ]+", name);
    }

    public boolean validateMarks(int marks) {
        return marks >= 0 && marks <= 100;
    }

    public double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public String calculateGrade(double average) {

        if (average >= 90) return "A";
        else if (average >= 75) return "B";
        else if (average >= 60) return "C";
        else if (average >= 40) return "D";
        else return "Fail";
    }

    public void printResult(String name, int m1, int m2, int m3, double avg, String grade) {

        System.out.println("Student Name : " + name);
        System.out.println("Marks 1      : " + m1);
        System.out.println("Marks 2      : " + m2);
        System.out.println("Marks 3      : " + m3);
        System.out.println("Average      : " + avg);
        System.out.println("Grade        : " + grade);
    }
}
