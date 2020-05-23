package common.map.api;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueCodeExample {

    Deque<Integer> dequeue;
    PriorityQueue<Integer> priorityQueue;

    public  QueueCodeExample() {
        dequeue = new ArrayDeque<>();
        priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
    }

    public void runDequeMethods() {
        dequeue.offerFirst(1);
        dequeue.offerFirst(2);
        dequeue.offerFirst(3);

        System.out.println("First element" + dequeue.peekFirst());
        for (int i : dequeue) {
            System.out.println(i);
        }
        System.out.println("last element" + dequeue.peekFirst());

        int firstelemnt = dequeue.pollFirst();
        int lastelemnt = dequeue.pollLast();

        dequeue.offer(5);
        dequeue.peek();
        dequeue.poll();
    }

    public void runPriorityQueueMethods() {
        priorityQueue.offer(1);
        priorityQueue.peek();
        priorityQueue.poll();
    }
}
