package EasyProblems;
import java.util.*;
public class TribonacciNum {
    /*
    Attempt 1
    Runtime: 3ms
    Memory: 35MB 71%
     */
    public int tribonacci(int n) {
        if(n == 0)
            return 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(1);
        for(int i = 2; i < n; i++){
            list.add(list.stream().mapToInt(Integer::intValue).sum());
            list.remove(0);
        }
        return list.get(list.size() - 1);
    }

    /*
    Attempt 1
    Runtime: 0ms
    Memory: 35MB 83%
     */
    public int tribonacci2(int n) {
        if(n < 2)
            return n;

        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i <= n; i++){
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }
}
