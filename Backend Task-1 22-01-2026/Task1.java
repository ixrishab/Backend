 import java.util.*;
 class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     try{
        System.out.println("Enter a number");
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
        if((n&1)==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }catch(Exception e){
      System.out.println("please enter a valid integer.");
    }
    }
}
