import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class BinaryStringPermutation {

    public static void main( String[] args ) {
        String str = "0110";
        int k = 2;
        System.out.println( hasAllCodes( str, k ));

    }

    public static boolean hasAllCodes(String s, int k) {
        Set<String> result = new HashSet<String>();
        String temp;
        int need = (int) Math.pow(2,k);

        //sliding window
        for( int i = k; i<= s.length();i++ ) {
            temp = s.substring(i-k,i);
            if( !result.contains(temp))  {
                result.add(temp);
                need--;
                if( need == 0 ) {
                    return true;
                }
            }

        }
        return false;
    }

}
