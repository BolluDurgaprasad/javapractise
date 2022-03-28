import java.util.*;
class HashMapEmploye {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap();
        Scanner sc=new Scanner(System.in);
        boolean lpa=true;
        do{
            System.out.println("Enter emp code:");
            int code=sc.nextInt();
            System.out.println("Enter Emp name:");
            String name=sc.next();
            System.out.println("Enter another student (y/n)?");
            String answer=sc.next();
            map.put(code,name);
            if(answer.equals("y")||answer.equals("Y")){
                continue;
            }else{
                break;
            }
            }while(lpa);
        /* for (Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }*/
        for(Map.Entry m:map.entrySet()){
           // System.out.println(m.getKey()+" "+m.getValue());
            System.out.println(m.getValue());
        }
      
       }
}