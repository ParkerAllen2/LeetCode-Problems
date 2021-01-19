package EasyProblems;

import java.util.ArrayList;

public class WeakestRowsInMatrix {

    /*
    Attempt 1
    Runtime: 1ms 99%
    Memory: 40MB 20%
    */
    public int[] kWeakestRows(int[][] mat, int k){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < mat.length; i++){
            list.add(i);
        }
        int counter = 0;
        int[] rtn = new int[k];
        for(int r = 0; r < mat[0].length; r++){
            for(int c = 0; c < list.size(); ){
                if(mat[list.get(c)][r] == 0){
                    rtn[counter] = list.remove(c);
                    counter++;
                    if(counter == k){
                        return rtn;
                    }
                    continue;
                }
                c++;
            }
        }
        for(int i = 0; counter < k; i++, counter++){
            rtn[counter] = list.get(i);
        }
        return rtn;
    }
}
