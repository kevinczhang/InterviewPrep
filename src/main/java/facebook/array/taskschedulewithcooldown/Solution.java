package facebook.array.taskschedulewithcooldown;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by czhang on 1/4/2017. *
 */
public class Solution {
    /***
     * Cool down time is 2 and task time is 1
     * @param tasks
     * @return
     */
    public int taskCoolDown(char[] tasks){
        if(tasks == null || tasks.length == 0) return 0;
        char cold_1 = ' ';
        char cold_2 = ' ';
        Map<Character, Integer> lastDone = new HashMap<>();
        int time = 0;
        for(char t : tasks){
            if(t == cold_1){
                time = + 2;
            } else if (t == cold_2){
                time += 1;
            }
            time += 1;
            lastDone.put(t, time);
        }
        return time;
    }

    /****
     *
     * @param tasks
     * @return
     */
    public int taskCoolDown2(char[] tasks, int cool){
        Map<Character, Integer> lastDone = new HashMap<>();
        int time = 0;
        for(char t : tasks){
            if(lastDone.containsKey(t) && (lastDone.get(t) + cool) > time){
                time = lastDone.get(t) + cool;
            }
            time += 1;
            lastDone.put(t, time);
        }
        return time;
    }
}
