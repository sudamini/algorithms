public class DuplicateZeros {
    public static void main( String args[] ) {

        int[] nums = new int[] {0,4,1,0,0,8,0,0,3};
        duplicateZeros( nums );

    }

    private static void duplicateZeros( int[] nums ) {
        for( int i = 0; i < nums.length; i++ ) {
            if( nums[i] == 0 ) {
                for( int j = nums.length-1; j > i; j-- ) {
                    nums[j] = nums[j-1];
                }
                i = i+1;
            }
        }
       toString1( nums );
    }
    private static void toString1( int[] nums ) {
        for( int i =0; i < nums.length; i++ ) {
            System.out.print(nums[i] + ", ");
        }
    }
}
