package EasyProblems;

public class MaxNestedParan {
    /*
    Attempt 1
    Runtime: 0ms 100%
    Memory: 37MB 33%
     */
    public int maxDepth(String s) {
        int counter = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                counter++;
                max = Math.max(max, counter);
            }
            else if(c == ')'){
                counter--;
            }
        }
        return max;
    }

    /*
    Attempt 2
    Runtime: 0ms 100%
    Memory: 37MB 85%
     */
    public int maxDepth2(String s) {
        int counter = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                counter++;
                max = Math.max(max, counter);
            }
            else if(c == ')'){
                counter--;
            }
        }
        return max;
    }
}
