public class Task4 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 75);
        Student s2 = new Student(2, "Bob", 35);

        printStudentResult(s1);
        printStudentResult(s2);
    }

    private static void printStudentResult(Student s) {
        System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Marks: " + s.getMarks() + ", Passed: "
                + s.isPassed());
    }
}

class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public boolean isPassed() {
        return this.marks >= 40;
    }
}
