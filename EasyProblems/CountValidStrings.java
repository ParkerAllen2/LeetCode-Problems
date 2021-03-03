package EasyProblems;

public class CountValidStrings {
    /*
    Attempt 1
    Runtime: 114ms 5%
    Memory: 45MB 16%
    */
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = words.length;
        for(String s : words){
            for(String c : s.split("")){
                if(!allowed.contains(c)){
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }

    /*
    Attempt 2
    Runtime: 22ms 22%
    Memory: 40MB 26%
    */
    public int countConsistentStrings2(String allowed, String[] words) {
        int counter = words.length;
        for(String s : words){
            for(int i = 0; i < s.length(); i++){
                if(!allowed.contains(s.substring(i, i + 1))){
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }

    /*
    Attempt 3
    Runtime: 5ms 98%
    Memory: 39MB 72%
    */
    public int countConsistentStrings3(String allowed, String[] words) {
        boolean[] alpha = new boolean[26];
        for(char c : allowed.toCharArray()){
            alpha[c - 'a'] = true;
        }

        int counter = words.length;
        for(String s : words){
            for(char c : s.toCharArray()){
                if(!alpha[c - 'a']){
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }
}
