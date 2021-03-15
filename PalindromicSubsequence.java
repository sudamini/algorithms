import com.sun.deploy.security.SelectableSecurityManager;

public class PalindromicSubsequence {

    public static void main( String args[] ) {
        System.out.println(removePalindromeSub("baabb"));

        //System.out.println( isPalindrome("bb"));
    }

    public static int removePalindromeSub(String s) {
        if( isPalindrome(s)) {
            return 1;
        }
        if( s.length() == 0 ) {
            return 0;
        }
        return 2;
    }

    private static boolean isPalindrome( String s ) {

        char[] chars = s.toCharArray();
        for( int i = 0, j = s.length() - 1; i < j; ++i,--j ) {
            if( chars[i] != chars[j]) {
                return false;
            }
        }
        return  true;
    }

}
