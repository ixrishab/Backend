public class Task3 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static long findFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long fact = 1L;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int sum = add(5, 7);
        System.out.println("add(5, 7) = " + sum);

        int check = 4;
        System.out.println("isEven(" + check + ") = " + isEven(check));

        int n = 5;
        System.out.println("findFactorial(" + n + ") = " + findFactorial(n));
    }
}
