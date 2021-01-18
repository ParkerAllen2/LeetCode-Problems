package EasyProblems;

public class MaxGeneratedArray {

    /*
    Attempt 1
    Runtime: 0ms 100%
    Memory: 37MB 8%
    Note: the array generated is pascal's triangle
    */
    public int getMaximumGenerated(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;

        for(int i = 1; i * 2 + 1 < arr.length; i++){
            arr[i * 2] = arr[i];
            arr[i * 2 + 1] = arr[i] + arr[i + 1];
            max = Math.max(max, Math.max(arr[i * 2], arr[i * 2 + 1]));
        }

        return max;
    }

    /*
    Attempt 2
    Runtime: 0ms 100%
    Memory: 35MB 99%
    */
    public int getMaximumGenerated2(int n) {
        if(n < 2){
            return n;
        }

        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 0;

        for(int i = 2; i <= n; i++){
            arr[i] = arr[i / 2];
            if(i % 2 == 1)
                arr[i] += arr[i / 2 + 1];

            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
