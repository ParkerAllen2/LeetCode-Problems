package EasyProblems;

public class RemovePalindrom {
    /*
    Attempt 1
    Runtime: 157ms 5%
    Memory: 39MB 6%
     */
    public int removePalindromeSub(String s) {
        if(s.equals("")){
            return 0;
        }

        for(int i = s.length(); i > 0; i--){
            if(isPali(s.substring(0, i))){
                return Math.min(1 + removePalindromeSub(s.substring(i)), 2);
            }
        }
        return 1;
    }

    public boolean isPali(String s)
    {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    /*
    Attempt 2
    Runtime: 0ms 100%
    Memory: 36MB 74%
     */
    public int removePalindromeSub2(String s) {
        if(s.equals("")){
            return 0;
        }

        if(s.equals(new StringBuilder(s).reverse().toString())){
            return 1;
        }
        return 2;
    }
}
