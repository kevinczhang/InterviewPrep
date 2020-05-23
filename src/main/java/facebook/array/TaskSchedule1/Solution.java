package facebook.array.TaskSchedule1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	String getStr(String s, int k) {
		Map<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			int idx = map.getOrDefault(c, -k);
			while (sb.length() - k < idx) {
				sb.append("_");
			}
			sb.append(c);
			map.put(c, sb.length());
		}
		return sb.toString();
	}

	public static int missionOrder(int[] mission, int N) {
		if (mission.length == 0) {
			return 0;
		}
		Map<Integer, Integer> map = new HashMap<>();
		int time = 0;
		for (int i = 0; i < mission.length; i++) {
			time++;
			if (!map.containsKey(mission[i])) {
				map.put(mission[i], time);
			} else {
				if (time - map.get(mission[i]) > N) {
					map.put(mission[i], time);
				} else {
					time = N + map.get(mission[i]) + 1;
					map.put(mission[i], time);
				}
			}
		}
		return time;
	}
}
