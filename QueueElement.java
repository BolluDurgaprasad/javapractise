import java.util.*;
class QueueElement {
    public static void main(String[]args)
    {
        PriorityQueue<String>queue=new PriorityQueue<String>();
        queue.add("Durga");
        queue.add("Naga");
        queue.add("Vijay");
        queue.add("Ravi");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String>itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}