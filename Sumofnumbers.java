import java.util.Scanner;
class Sumofnumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the num1");
        num1=sc.nextInt();
             System.out.println("Enter the num2");
                num2=sc.nextInt();
                int sum=num1+num2;
                    System.out.println("the sum of two numbers is"+sum);
    }
}
