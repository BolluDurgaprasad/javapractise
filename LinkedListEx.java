import java.util.*;
public class LinkedListEx
{
    public static void main(String[]args)
    {
        LinkedList<String>al=new LinkedList<String>();
        al.add("Durga");
        al.add("Naga");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String>itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}