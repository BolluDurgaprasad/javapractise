import java.utill.Scanner;
public class armstrongnumber 
{
    public static void main(String[] args);
    {
        int temp,digits=0,last=0,sum=0;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            digits++;
        }
    temp=n;
    while(temp>0)
    {
       last = temp % 10;
       sum += (Math.pow(last,digits));
       temp = temp/10;
    }
    if(n == sum)
    return true ;
    else return false;
{
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        num=sc.nextint();
        System.out.println("armstrong number up to"+num+"are:");
        for(inti=0;i<=num;i++)
        if(isarmstrong(i))
        System.out.print(i+",");
    }
}


    
    


