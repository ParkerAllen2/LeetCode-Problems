package EasyProblems;

import java.util.*;
public class MaxUnitsTruck {
    /*
    Attempt 1
    Runtime: 25ms 16%
    Memory: 52MB
    */

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparing(i -> -i[1]));
        int count = 0;
        int numOfBoxes = 0;
        for(int i = 0; i < boxTypes.length && numOfBoxes < truckSize; i++){
            int maxNumBoxes = Math.min(truckSize - numOfBoxes, boxTypes[i][0]);
            count += maxNumBoxes * boxTypes[i][1];
            numOfBoxes += maxNumBoxes;
        }
        return count;
    }

    /*
    Attempt 2
    Runtime: 7ms 95%
    Memory: 39MB 64%
    */

    public int maximumUnits2(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> -Integer.compare(a[1], b[1]));
        int count = 0;
        for(int[] box : boxTypes){
            if(truckSize < box[0]){
                return count + truckSize * box[1];
            }
            count += box[0] * box[1];
            truckSize -= box[0];
        }
        return count;
    }
}
