import java.util.Scanner;
public class Percentageofmarks{
    public static void main(String[]args){
        float percentage;
        float totalmarks;
        float scored;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your marks::");
        scored = sc.nextFloat();
        System.out.println("enter total marks::");
        totalmarks = sc.nextFloat();
        percentage=(float)((scored/totalmarks)*100);
        System.out.println("percentage::"+percentage);
    }
}
