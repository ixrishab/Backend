package org.example.Task5;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks in subject 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter marks in subject 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter marks in subject 3: ");
            int m3 = sc.nextInt();

            GradeService service = new GradeService();
            GradeController controller = new GradeController(service);

            controller.processResult(name, m1, m2, m3);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
