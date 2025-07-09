import java.util.Scanner;
public class Fibonacci_Recursion {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its Fibonacci value:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("Fibonacci value of " + n + " is: " + Fibo(n));
    }
    static int Fibo(int n) {
        if (n < 2) {
            return n;
        }
            return Fibo(n - 1) + Fibo(n - 2);
    }
}
// This code calculates the Fibonacci value of a given number using recursion.