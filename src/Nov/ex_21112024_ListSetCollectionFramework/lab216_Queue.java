package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.PriorityQueue;

public class lab216_Queue {
    public static void main(String[] args) {
        //FIFO
        // -> 0.001% use in automation
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
       // pq.offer(1);
        pq.offer("2");
        pq.offer("3");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq); 
    }
}
