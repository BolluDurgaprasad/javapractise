import java.util.*;
class HashMapKeyValues{
    public static void main(String args[]){
   HashMap<Integer,String> hm=new HashMap();
     boolean val=true;
     Scanner sc=new Scanner(System.in);
     do
     {
         System.out.print("Enter  Value :");
         Integer value=Integer.parseInt(sc.nextLine());
         System.out.print("Enter the Key :");
         String key= sc.nextLine();
         
         String data=hm.put(value,key); 
         System.out.print("Enter Another Student (y/n)? ");
         String choice=sc.nextLine();
         if(choice.equals("y")){
             continue;
         }
          else{
              break;
          }
         
     }
     while(val);
     System.out.print("The size of the Map is :"+hm.size());
    }
}