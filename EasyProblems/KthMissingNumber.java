package EasyProblems;

public class KthMissingNumber {
    /*
    Attempt 1
    Runtime: 1ms 29%
    Memory: 38MB 81%
     */
    public int findKthPositive(int[] arr, int k) {
        int missing = 0;
        int counter = 0;
        int pointer = 0;
        do{
            counter++;
            if(pointer < arr.length && arr[pointer] == counter){
                pointer++;
            }
            else{
                missing++;
            }
        }while(missing < k);
        return counter;
    }

    /*
    Attempt 2
    Runtime: 0ms 100%
    Memory: 38MB 96%
     */
    public int findKthPositive2(int[] arr, int k) {
        for(int i = arr.length - 1; i >= 0; i--){
            int val = arr[i] - i;
            if(k >= val){
                return k - val + arr[i] + 1;
            }
        }
        return k;
    }
}
