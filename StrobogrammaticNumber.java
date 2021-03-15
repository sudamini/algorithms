import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumber {

    public static void main( String args[] ) {
        System.out.println(isStrobogrammatic( "962"));
    }


    public static boolean isStrobogrammatic( String num ) {


        Map<Character,Character> numbers = new HashMap<Character, Character>();
        numbers.put('1', '1');
        numbers.put('4', '4');
        numbers.put('6', '9');
        numbers.put('8', '8');
        numbers.put('9', '6');

       char[] chararr = num.toCharArray();
       StringBuilder reverse = new StringBuilder();
       for( int i = 0; i < chararr.length; i++ ) {
           System.out.println(chararr[i]);
           if( numbers.containsKey(chararr[i])) {
               reverse = reverse.append(numbers.get(chararr[i]));
           }

       }

       return reverse.reverse().toString().equals(num);


    }


}
