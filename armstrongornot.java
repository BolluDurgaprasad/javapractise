import java.utill.Scanner;
public class armstrongornot {
    public static void main(String[] args)
    {
        int num, number, temp, total = 0;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        num = scanner.nextInt();
        scanner . close();
        number = num;
        for(;number!=0;number/=10)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
        }
        if(total == num)
        System.out.println(num + "is an armstrong number");
        else
        System.out.println(num + " is not armstrong number");
    }
}