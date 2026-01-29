 import java.util.*;
 class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("It is a negative number");
        }
        else if(n > 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("The number is 0");
        }
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
