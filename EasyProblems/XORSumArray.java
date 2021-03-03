package EasyProblems;

public class XORSumArray {
    /*
    Attempt 1
    Runtime: 0ms 100%
    Memory: 35MB 99%
    */
    public int xorOperation(int n, int start) {
        int sum = start;
        for(int i = 1; i < n; i++){
            sum = sum ^ (start + 2 * i);
        }
        return sum;
    }
}
