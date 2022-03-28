import java.util.*;
class ArrayDequeElements{
    public static void main(String args[]){
        ArrayDeque <Integer> au=new ArrayDeque();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Manyelements ");
       int n=sc.nextInt();
        System.out.println("Enter Values :");
        for(int i=0;i<n;i++){
        au.add(sc.nextInt());
        }
        System.out.println();
        System.out.println("Iterator Values Are ");
        for(Integer a:au){
            System.out.println(a);
        }
    }
}