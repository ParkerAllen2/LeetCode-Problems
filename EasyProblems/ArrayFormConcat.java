package EasyProblems;
import java.util.*;
public class ArrayFormConcat {
    /*
    Attempt 1
    Runtime: 1ms 63%
    Memory: 38MB 32%
    */
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int[] i : pieces){
            map.put(i[0], i);
        }

        int pointer = 0;
        for(int i = 0; i < pieces.length; i++)
        {
            if(map.containsKey(arr[pointer])){
                for(int piece : map.get(arr[pointer])){
                    if(arr[pointer] == piece){
                        pointer++;
                    }
                    else{
                        return false;
                    }
                }
            }
            if(pointer >= arr.length){
                return true;
            }
        }
        return false;
    }

    /*
    Attempt 2
    Runtime: 1ms 63%
    Memory: 37MB 93%
     */
    public static boolean canFormArray2(int[] arr, int[][] pieces) {
        int length = arr.length;
        int index = 0;
        while(index < length){
            int[] piece = new int[0];
            for(int[] p : pieces){
                if(arr[index] == p[0]){
                    piece = p;
                    break;
                }
            }
            if(piece.length == 0){
                return false;
            }
            for(int p : piece){
                if(p != arr[index]){
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
