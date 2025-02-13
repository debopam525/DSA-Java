import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int ans=0;
        Scanner in=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the operator:");
            char op=in.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
                System.out.println("Enter two numbers: ");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if (op=='+')
                {
                    ans=num1+num2;
                }
                if (op=='-')
                {
                    ans=num1-num2;
                }
                if (op=='*')
                {
                    ans=num1*num2;
                }
                if (op=='/')
                {
                    if (num2!=0)
                    {
                        ans=num1/num2;
                    }
                    else
                    {
                        System.out.println("Cannot divide by zero");
                    }
                }
                if (op=='%')
                {
                    ans=num1%num2;
                }
            }
            else if (op=='x'||op=='X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}
