package common.map.api;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueCodeExample {

    Deque<Integer> queue;

    public  QueueCodeExample() {
        queue = new ArrayDeque<>();
    }

    public void runDequeMethods() {
        queue.offerFirst(1);
        queue.offerFirst(2);
        queue.offerFirst(3);

        System.out.println("First element" + queue.peekFirst());
        for (int i : queue) {
            System.out.println(i);
        }
        System.out.println("last element" + queue.peekFirst());

        int firstelemnt = queue.pollFirst();
        int lastelemnt = queue.pollLast();
    }
}
