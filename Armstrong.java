import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 100; i <= 1000; i++) { // Printing all 3 digit armstrong numbers
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }
        return sum == original;
    }
    
}
