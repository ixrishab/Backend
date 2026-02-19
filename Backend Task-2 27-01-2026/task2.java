import java.util.*;
public class task2 {
    public static void main(String[] args) {
        String[] employees = { "Rishab",
                "Anita",
                "Rahul",
                "Rishab",
                "Neha",
                "Anita",
                "Amit" };
                List<String> employeeList = Arrays.asList(employees);
                ArrayList<String> uniqueEmployees = new ArrayList<>(new HashSet<>(employeeList));
                System.out.println("Unique Employees: " + uniqueEmployees);
                HashMap<String, Integer> FrequencyCount = new HashMap<>();
                for(String name :employees){
                    FrequencyCount.put(name, FrequencyCount.getOrDefault(name, 0) + 1);
                }
                System.out.println("Frequency Count: " + FrequencyCount);
    }
}
