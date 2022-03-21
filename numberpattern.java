import java.util.Scanner;
public class numberpattern{
    public static void main(String[]args){
        int i,j,rows=9;
        for(i=1;i<=rows;i++)
        {
          for(j=1;j<=i;j++) 
          {
              if(j%2==0)
              {
                  System.out.println(0);
              }
          else
          {
              System.out.println(1);
          }
        }
        System.out.println();
    }
}
}
