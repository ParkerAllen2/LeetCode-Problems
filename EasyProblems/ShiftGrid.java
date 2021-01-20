package EasyProblems;
import java.util.*;
public class ShiftGrid {
    /*
    Attempt 1
    Runtime: 5ms 70%
    Memory: 40 47%
     */
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid[0].length, c = grid.length;
        int size = r * c;

        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < c; i++){
            list.add(new ArrayList<>());
            for(int j = 0; j < r; j++)
                list.get(i).add(0);
        }

        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++){
                int m = (i * r + j + k) % size;
                list.get(m / r).set(m % r, grid[i][j]);
            }
        }
        return list;
    }

    /*
    Attempt 2
    Failed
     */
    public List<List<Integer>> shiftGrid2(int[][] grid, int k) {
        int r = grid[0].length, c = grid.length;
        int size = r * c;

        int gcd = gcdCalc(k, size);
        gcd = gcd == 1? k : gcd;
        int counter = 0, x = 0, y = 0;
        int past = grid[0][0];
        while (counter < size){
            for(int i = 0; i < gcd && counter < size; i++)
            {
                int m = (y * r + x + k) % size;
                y = m / r;
                x = m % r;
                int temp = past;
                past = grid[y][x];
                grid[y][x] = temp;
                counter++;
            }
            int m = (y * r + x + 1) % size;
            y = m / r;
            x = m % r;
            past = grid[y][x];
        }

        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : grid) {
            List<Integer> list = new ArrayList<>();
            for (int i : ints) {
                list.add(i);
            }
            lists.add(list);
        }
        return lists;
    }

    public int gcdCalc(int a, int b){
        if(b == 0)
            return a;
        return gcdCalc(b, a % b);
    }


}
