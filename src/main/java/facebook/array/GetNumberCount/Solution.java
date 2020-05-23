package facebook.array.GetNumberCount;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	class Pair {
		int c;
		int count;

		public Pair(int c, int count) {
			this.c = c;
			this.count = count;
		}
	}

	public List<Pair> getCount(int[] arr) {
		List<Pair> list = new ArrayList<>();
		if (arr == null || arr.length == 0) {
			return list;
		}

		int start = 0;
		while (start < arr.length) {
			int end = findLast(start, arr);
			list.add(new Pair(arr[start], end - start + 1));
			start = end + 1;
		}

		return list;
	}

	private int findLast(int start, int[] arr) {
		int c = arr[start];
		int diff = 1;
		while (start + diff < arr.length && arr[start + diff] == c) {
			diff <<= 1;
		}
		if (start + diff >= arr.length) {
			return arr.length - 1;
		}

		int end = start + diff;
		while (start + 1 < end) {
			int mid = (end - start) / 2 + start;
			if (arr[mid] == c) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (arr[end] == c) {
			return end;
		} else {
			return start;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
		Solution d = new Solution();
		List<Pair> res = d.getCount(arr);
		for (Pair p : res) {
			System.out.println(p.c + ": " + p.count);
		}
	}
}
