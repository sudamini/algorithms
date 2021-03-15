//Given a binary array, find the maximum number of consecutive 1s in this array.

public class MaxConsecutiveBinaryArray {

    public static void main( String[] args ) {
        int[] arr = new int[] { 1,1,0,1,1,1,0,1,0,1,1,1,1,1,1 };
        System.out.println( findMaxConsecutive(arr));
    }

    private static int findMaxConsecutive( int[] arr ) {
        int maxSoFar = 0;
        int currMax = 0;
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] == 1 ) {
                currMax += 1;
            } else {
                if( currMax > maxSoFar ) {
                    maxSoFar = currMax;
                }
                currMax = 0;
                }
        }

        if( currMax > maxSoFar ) {
            return currMax;
        }
        return maxSoFar;
    }

}
