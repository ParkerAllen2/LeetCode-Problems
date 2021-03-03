package MediumProblems;

import java.util.Arrays;

public class WidestVerticalArea {
    /*
    Attempt 1
    Runtime: 11ms 99%
    Memory: 67MB 64%
    */
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xVals = new int[points.length];
        for( int i = 0; i < points.length; i++){
            xVals[i] = points[i][0];
        }
        Arrays.sort(xVals);
        int max = 0;
        for(int i = 0; i < xVals.length - 1; i++){
            max = Math.max(max, xVals[i + 1] - xVals[i]);
        }
        return max;
    }
}
