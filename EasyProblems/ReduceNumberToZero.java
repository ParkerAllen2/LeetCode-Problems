package EasyProblems;

public class ReduceNumberToZero {
    /*
    Attempt 1
    Runtime: 0ms 100%
    Memory: 35MB 79%
     */
    public int numberOfSteps (int num) {
        if(num <= 2)
            return num;
        if(num % 2 == 1)
            return 1 + numberOfSteps(num - 1);
        return 1 + numberOfSteps(num / 2);
    }
}
