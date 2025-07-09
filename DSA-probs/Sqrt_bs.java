import java.util.*;
public class Sqrt_bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square root:");
        int n = sc.nextInt();
        System.out.println("Enter the precision (number of decimal places): ");
        int p = sc.nextInt();
        System.out.printf("Square root of " + n + " is: %.3f", sqrt(n, p));
    }
    static double sqrt(int n, int p) {
    int start = 0;
    int end = n;
    double root = 0.0;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mid * mid == n) {
            return mid;
        }
        if (mid * mid < n) {
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }
    }
    double incr = 0.1;
    for (int i = 0; i < p; i++) {
        while (root * root <= n) {
            root = root + incr;
        }
        root = root - incr;
        incr = incr / 10;
    }
    return root;
}
}