import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task4 {

    public static void main(String[] args) {

        String[] inputs = {"10", "20.5", "abc", "30", "15.5", "xyz"};

        List<Number> numbers = new ArrayList<>();

        for (String input : inputs) {
            try {
                if (input.contains(".")) {
                    Double d = Double.valueOf(input); 
                    numbers.add(d);
                } else {
                    Integer i = Integer.valueOf(input);
                    numbers.add(i);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input ignored: " + input);
            }
        }

        int intSum = 0;
        double doubleSum = 0.0;
        int doubleCount = 0;

        for (Number num : numbers) {

            if (num instanceof Integer) {
                intSum += num.intValue();   
            } else if (num instanceof Double) {
                doubleSum += num.doubleValue(); 
                doubleCount++;
            }
        }

        double doubleAverage = doubleCount > 0
                ? doubleSum / doubleCount
                : 0.0;

        System.out.println("\nStored Numbers: " + numbers);
        System.out.println("Sum of Integers: " + intSum);
        System.out.println("Average of Doubles: " + doubleAverage);

        System.out.println("\nIterating using Iterator:");
        Iterator<Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
