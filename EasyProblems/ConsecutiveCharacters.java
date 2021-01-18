package EasyProblems;

public class ConsecutiveCharacters {
    /*
    Attempt 1
    Runtime: 1ms 100%
    Memory: 38MB 34%
     */
    public int maxPower(String s) {
        int max = 1, counter = 1;
        char past = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            char next = s.charAt(i);
            if(next == past){
                counter++;
                max = Math.max(max, counter);
            }
            else{
                counter = 1;
                past = next;
            }
        }
        return max;
    }

    /*
    Attempt 2
    Runtime: 1ms 100%
    Memory: 37MB 84%
     */
    public int maxPower2(String s) {
        int max = 1, counter = 1;
        char past = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == past){
                counter++;
                max = Math.max(max, counter);
            }
            else{
                counter = 1;
                past = s.charAt(i);
            }
        }
        return max;
    }
}
