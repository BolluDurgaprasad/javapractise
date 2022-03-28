import java.util.*;
public class HashSet
{
    public static void main(String[]args)
    {
        Set<Integer>data=new LinkedHashSet<Integer>();
        data.add(98);
        data.add(67);
        data.add(45);
        data.add(43);
        System.out.println("data:"+data);
        System.out.println("\nThe hash code value of set is:"+data.hashCode());
    }
}