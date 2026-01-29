import java.util.*;

class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("Printing all even numbers");
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Calculating sum of numbers");
        for(i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}