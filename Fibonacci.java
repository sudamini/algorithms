public class Fibonacci {

    public static void main( String args[] ) {
        System.out.println( fibonacciRecursive(10));
        System.out.println( fibonacciMemoization(10));
    }

    private static int fibonacciMemoization( int n ) {

        int[] memoize = new int[n+1];
        return calculateFibonacciRecursiveMemoization( memoize, n );

    }
    // this is a dynamic programming solution that uses memoization.
    private static int calculateFibonacciRecursiveMemoization( int[] memoize, int n ) {
        if( n < 2 ) {
            return n;
        }
        if( memoize[n] != 0 ) {
            return memoize[n];
        }
        memoize[n] = calculateFibonacciRecursiveMemoization( memoize, n-1) + calculateFibonacciRecursiveMemoization( memoize, n-2 );
        return  memoize[n];
    }

    // this is a non DP recursive solution.
    // to smaller sub problems. This method does not make use of memoization.
    // it will solve the same problem again even if previously solved; because it does not store the results.

    private static int fibonacciRecursive( int n ) {
        if( n < 2 ) {
            return n;
        }
        int ans = fibonacciRecursive(n-1) + fibonacciRecursive( n-2 );
        return ans;
    }
}
