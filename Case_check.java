import java.util.Scanner;
public class Case_check {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner in=new Scanner(System.in);
        char ch =in.next().trim().charAt(0);
        if (ch>='a'&&ch<='z')
        {
            System.out.println("Lowercase");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println("Uppercase");
        }
        else
        {
            System.out.println("Invalid");
        }
        
    }
    
}