import java.util.Scanner;
 public class factors{
    public static void main (String args[])
    {
        int i;
        Scanner sc = new Scanner (System.in);
          System.out.println("enter number");
       int n=sc.nextInt();
       for(i=1;i<n;i++)
       {
           int temp=i;
           if(n%temp==0);
           {
                System.out.println("enter factors");
           }
       }
      
        
    }
}