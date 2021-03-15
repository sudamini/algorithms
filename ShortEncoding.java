import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ShortEncoding {

    public static void main( String args[] ) {
        String[] words = new String[] {"time", "me", "bell"};
        System.out.println( minimumLengthEncoding ( words ));
    }


        public static int minimumLengthEncoding(String[] words) {

        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        StringBuilder builder = new StringBuilder();
            for( int i = 0; i < words.length; i++ ) {
                System.out.println( words[i] );
                System.out.println( builder.indexOf(words[i]));
                if( builder.indexOf(words[i] + "#") == -1 ) {
                    builder = builder.append(words[i]).append("#");
                }
            }
            return builder.length();
        }


}
