package facebook.array.TaskSchedule2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class Solution {
	public String separateTasks(String taskSeq, int k) {
		// Map for tasks and their frequency
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : taskSeq.toCharArray()) {
			if (!map.containsKey(ch))
				map.put(ch, 1);
			else
				map.put(ch, map.get(ch) + 1);
		}

		// MaxHeap to sort map entry
		class CompClass implements Comparator<Map.Entry<Character, Integer>> {
			public int compare(Entry<Character, Integer> entry1, Entry<Character, Integer> entry2) {
				// VERY IMPO:If the priority is the same, sort elements alphabetic order
				if (entry2.getValue() == entry1.getValue()) 
					return entry2.getKey() - entry1.getKey();
				else
					return entry2.getValue() - entry1.getValue();
			}
		}

		CompClass comp = new CompClass();
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(map.size(), comp);
		maxHeap.addAll(map.entrySet());

		StringBuilder sb = new StringBuilder();
		Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
		int remCharCount = taskSeq.length();
		while (!maxHeap.isEmpty()) {
			int count = k;
			while (count >= 0) {
				Map.Entry<Character, Integer> task = maxHeap.poll();
				if (task != null) {
					sb.append(task.getKey());
					task.setValue(task.getValue() - 1);
					queue.offer(task);
					remCharCount--;
				} else if (remCharCount > 0) { 
					// This is to avoid appending _ to the final string even if the whole task seq is processed, 
					// but k is remaining
					sb.append("_");
				}
				count--;
			}

			int queSize = queue.size();
			while (queSize != 0) {
				Map.Entry<Character, Integer> task = queue.poll();
				if (task.getValue() > 0)
					maxHeap.offer(task);
				queSize--;
			}
		}
		System.out.println("Min length = " + sb.length());
		return sb.toString();

	}
}
