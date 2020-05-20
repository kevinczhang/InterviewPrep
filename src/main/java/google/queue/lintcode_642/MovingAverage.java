package google.queue.lintcode_642;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverage {
    Deque<Integer> queue = new ArrayDeque<>();
    double capacity;
    double sum;

    /*
     * @param size: An integer
     */
    public MovingAverage(int size) {
        capacity = (double)size;
        sum = 0;
    }

    /*
     * @param val: An integer
     * @return:
     */
    public double next(int val) {
        sum += val;
        queue.offerFirst(val);
        if (queue.size() > capacity) {
            sum -= queue.pollLast();
        }
        return sum/queue.size();
    }
}
