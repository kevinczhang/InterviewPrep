package google.queue.lintcode_879;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    /**
     * @param n: a integer, denote the number of teams
     * @return: a string
     */
    public String findContestMatch(int n) {
        Deque<String> deque = new ArrayDeque<>();

        for (int i = 1; i <= n/2; i++) {
            deque.offerLast("(" + i + "," + String.valueOf(n + 1 - i) + ")");
        }

        while(deque.size() > 1) {
            Deque<String> newDeque = new ArrayDeque<>();
            while (!deque.isEmpty()) {
                String team1 = deque.pollFirst();
                String team2 = deque.pollLast();
                newDeque.offerLast("(" + team1 + "," + team2 + ")");
            }
            deque = new ArrayDeque<>(newDeque);
        }

        return deque.peekFirst();
    }
}
