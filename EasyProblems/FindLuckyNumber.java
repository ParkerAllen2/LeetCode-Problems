package EasyProblems;
import java.util.*;
public class FindLuckyNumber {
    /*
    Attempt 1
    Runtime: 3ms 57%
    Memory 38MB 45%
     */
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.containsKey(i) ? map.get(i) + 1: 1);
        }

        int max = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey() == entry.getValue()){
                max = Math.max(entry.getKey(), max);
            }
        }
        return max;
    }

    /*
    Attempt 2
    Runtime: 1ms 99%
    Memory 39MB 25%
     */
    public int findLucky2(int[] arr) {
        int[] bigArr = new int[501];

        for(int i : arr){
            bigArr[i]++;
        }

        for(int i = 500; i > 0; i--){
            if(i == bigArr[i]){
                return i;
            }
        }
        return -1;
    }
}
