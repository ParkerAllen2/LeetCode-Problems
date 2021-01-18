package EasyProblems;

public class StringHalvesAlike {
   /*
    Attempt 1
    Runtime: 2ms 93%
    Memory Usage: 37MB 41%
    */

    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        char[] charrA = s.substring(0, half).toCharArray();
        char[] charrB = s.substring(half).toCharArray();

        return countVowels(charrA) == countVowels(charrB);
    }

    public int countVowels(char[] arr){
        int count = 0;
        String key = "aeiou";
        for(char c : arr){
            if(key.indexOf(Character.toLowerCase(c)) != -1){
                count++;
            }
        }
        return count;
    }
}
