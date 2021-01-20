package EasyProblems;

public class MinChipsToMove {
    /*
    Attempt 1
    Runtime: 0ms 100%
    Memory: 36MB 70%
     */
    public int minCostToMoveChips(int[] position) {
        int evens = 0;
        for(int i : position){
            if(i % 2 == 0)
                evens++;
        }
        return Math.min(evens, position.length - evens);
    }
}
