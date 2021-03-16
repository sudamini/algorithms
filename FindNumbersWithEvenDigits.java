import com.sun.codemodel.internal.JForEach;

public class FindNumbersWithEvenDigits {

    public static void main( String args[] ) {
        int[] nums = new int[] { 12,345,2,6,7896 };
        System.out.println(findNumbersWithEvenDigits(nums));

    }
    //given an array of numbers, return how many of them contain an even number of digits
    public static int findNumbersWithEvenDigits( int[] nums )  {

        int ans = 0;
        int num = 0;
        int div = 0, times = 0;
        for( int i = 0; i < nums.length; i++ ) {
            num = nums[i];
            div = num;
            while ( div >= 0 ) {
                div = div / 10;
                if( div == 0 ) {
                    break;
                } else {
                    ++times;
                }
            }
            if( times % 2 == 1 ) {
                ans += 1;
            }
            times = 0;
        }

        return ans;
    }
}
