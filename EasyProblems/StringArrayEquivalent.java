package EasyProblems;

public class StringArrayEquivalent {

    /*
    Attempt 1
    Runtime: 3ms 14%
    Memory: 39MB 18%
    */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";

        for(int i = 0; i < word1.length; i++){
            w1 += word1[i];
        }

        for(int i = 0; i < word2.length; i++){
            w2 += word2[i];
        }

        return w1.equals(w2);
    }

    /*
    Attempt 2
    Runtime: 1ms 72%
    Memory: 37MB 71%
    */
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";

        int maxWord = Math.max(word1.length, word2.length);

        for(int i = 0; i < maxWord; i++){
            if(i < word1.length){
                w1 += word1[i];
            }
            if(i < word2.length){
                w2 += word2[i];
            }

            if(w1.equals("") || w2.equals("")){
                return false;
            }

            int minSize = Math.min(w1.length(), w2.length());
            if(!w1.substring(0, minSize).equals(w2.substring(0, minSize))){
                return false;
            }

            w1 = w1.substring(minSize);
            w2 = w2.substring(minSize);
        }
        return w1.equals("") && w2.equals("");
    }

    /*
    Attempt 3
    Runtime: 0ms 100%
    Memory: 37MB 79%
    */
    public static boolean arrayStringsAreEqual3(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        for(String s : word1){
            w1.append(s);
        }

        StringBuilder w2 = new StringBuilder();
        for(String s : word2){
            w2.append(s);
        }

        return w1.toString().equals(w2.toString());
    }
}
