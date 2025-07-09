import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        System.out.println("Enter the counting number: ");
        int p=in.nextInt();
        int count=0;
        while (n>0)
        {
            int rem=n%10;
            if(rem==p)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
    
}
