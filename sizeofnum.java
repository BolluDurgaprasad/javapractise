import java.util.*;
public class sizeofnum{
    public static void main(String[] args){
        int n,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        n=sc.nextInt();
        int a[]=new int[n];
        //Read elements from user
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        //sorting
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}