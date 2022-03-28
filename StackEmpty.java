import java.util.*;
public class StackEmpty
{
    public static void main(String[]args)
    {
        Stack<Integer>stk=new Stack<>();
        boolean result=stk.empty();
        System.out.println("is the stack?"+result);
        stk.push(78);
        stk.push(74);
        stk.push(45);
        System.out.println("Elements in stack:"+stk);
        result=stk.empty();
        System.out.println("is the stack empty?"+result);
    }
}