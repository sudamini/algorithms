import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {

    public static void main( String args[] ) {

        //String keyboard = "abcdefghijklmnopqrstuvwxyz";
        //String word = "cba";

        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        System.out.println( "Answer " + calculateTime( keyboard, word ));

    }


    public static int calculateTime(String keyboard, String word) {

        Map map = new HashMap<Character, Integer>();

        for( int i = 0; i < keyboard.length(); i++ ) {
            map.put(keyboard.charAt(i), i );
        }
        int distance = 0;
        int begin = 0;
        int val = 0;

        for( int i = 0; i < word.length(); i++ ) {
            val = ( int ) map.get(word.charAt(i));
            distance += Math.abs( Math.subtractExact( begin, val ) );
            begin = val;
        }
            return distance;
        }

}
