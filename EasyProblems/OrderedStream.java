package EasyProblems;

import java.util.*;

public class OrderedStream {
    /*
    Attempt 1
    Runtime: 65ms 94%
    Memory: 40MB 88%
    */
    String[] arr;
    int pointer;

    public OrderedStream(int n) {
        arr = new String[n];
        pointer = 0;
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList();
        arr[idKey - 1] = value;
        while(pointer < arr.length && arr[pointer] != null){
            list.add(arr[pointer]);
            pointer++;
        }
        return list;
    }
}
