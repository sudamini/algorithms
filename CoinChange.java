import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinChange {

    public static void main( String[] args ) {
        int[] coins = new int[] { 186,419,83,408};
        int amount = 6249;
        System.out.println( coinChange( coins, amount ));
    }

    public static int coinChange(int[] coins, int amount) {
        Integer[] coins1 = Arrays.stream( coins ).boxed().toArray( Integer[]::new );
        Arrays.sort( coins1, Collections.reverseOrder());
        System.out.println("Sorted array " +Arrays.toString(coins1));
        List collect = new ArrayList<Integer>();
        int sum = 0;
        int amt = amount;
        for( int i = 0; i < coins1.length; i++ ) {
            if( coins1[i] <= amt ) {
                collect.add(coins1[i]);
                amt = (int) ( amt - coins1[i] );
                sum += coins1[i];
                i = -1;
            }
        }
        System.out.println( "Collect " + collect );
        System.out.println( "Sum " +sum );
        if( sum == amount ) {
            return collect.size();
        }
        return -1;
    }
}
