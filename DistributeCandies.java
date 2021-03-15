import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static void main( String args[] ) {
        //int[] candy1 = new int[] {1,1,2,2,3,3};
        //int[] candy2 = new int[] {1,1,2,3};
        int[] candy3 = new int[] {6,6,6,6};

        System.out.println(distributeCandies(candy3));

    }
    public static int distributeCandies( int[] candyType ) {

        int how_many_candies = candyType.length / 2;
        System.out.println("She can eat " + how_many_candies + " different types of candies every day");
        Set<Integer> set = new HashSet();

        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }

        int n = set.size();
        int r = how_many_candies;
        if( n == 1 ) {
            return n;
        }
        BigInteger n_factorial = factorial( n );
        BigInteger n_minus_r_factorial = factorial ( n - r );
        BigInteger r_factorial = factorial ( r );
        BigInteger result_1 = n_factorial.divide(n_minus_r_factorial);
        BigInteger result_2 = result_1.divide( r_factorial );

        return result_2.intValue();

    }

    private static BigInteger factorial( int n ) {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
    }

}
