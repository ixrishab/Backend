package org.example.Task5;

public class GradeController {
    private GradeService service;

    public GradeController(GradeService service) {
        this.service = service;
    }

    public void processResult(String name, int m1, int m2, int m3) throws Exception {

        if (!service.validateName(name)) {
            throw new Exception("Student name must contain only letters.");
        }

        if (!service.validateMarks(m1) || !service.validateMarks(m2) || !service.validateMarks(m3)) {
            throw new Exception("Marks must be between 0 and 100.");
        }

        double average = service.calculateAverage(m1, m2, m3);
        String grade = service.calculateGrade(average);

        service.printResult(name, m1, m2, m3, average, grade);
    }
}
