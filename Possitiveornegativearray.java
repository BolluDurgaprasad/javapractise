import java.utill.Scanner;
public class Possitiveornegativearray{
    public static void main(String[]args){
        int countp=0, countn=0, countz=0, i;
        int[] arr = new int[10];
        scanner scan =new scanner(System.in);
        System.out.println("Enter numbers: ");
        for(i=0; i<10; i++)
        arr[i] = scan.nextInt();
        for(i=0; i<10; i++)
        {
            if(arr[i]<0)
            N++;
            else if(arr[i]>0)
            P++;
            else
            Z++;
        }
        System.out.println("\nTotal Positive Number: " );
         System.out.println("Total Negative Number: " );
            System.out.println("Total Zero: " );
    }
}
