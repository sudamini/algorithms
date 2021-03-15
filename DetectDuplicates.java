import java.math.BigInteger;
import java.util.*;

public class DetectDuplicates {

    public static void main( String args[] ) {

       int[] nums = new int[] {1,3,3};
       //findErrorNums(nums);
       findErrorNums1(nums);


        //Output: [2,3]

    }

    public static int[] findErrorNums1( int[] nums ) {

        Arrays.sort(nums);
        int missing = 0;
        int duplicate = 0;
        for( int i = 0; i < nums.length - 1; i++ ) {
            for( int j = i+1; j < nums.length; j++ ) {
                if( nums[i] == nums[j] ) {
                    if( i == 0 && nums[i] != 1 ) {
                        System.out.println( "Does not start with 1. Special case ");
                        missing = 1;
                        duplicate = nums[j];
                        break;
                    }
                    if( j == nums.length - 1 ) {
                        missing = nums[j] -1;
                        duplicate = nums[j];
                        break;
                    }
                    missing = nums[j] + 1;
                    duplicate = nums[j];
                }
            }
        }
        System.out.println( "Missing " + missing );
        System.out.println( "Duplicate " + duplicate );

        return new int[] { duplicate, missing };
    }


    public static int[] findErrorNums(int[] nums) {
        int duplicate = 0;
        int missing = 0;

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
         int size = nums.length;
         for( int i = 1; i <= size; i++ ) {
             map.put(i, 0);
         }
         int val = 0;

        for( int i = 0; i < nums.length; i++ ) {
            val = map.get(nums[i]);
            map.put(nums[i], val + 1 );
        }


            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                if( (int) pair.getValue() == 0 ) {
                    missing = (int) pair.getKey();
                    System.out.println( "missing " +missing );
                }
                if( (int) pair.getValue() == 2 ) {
                    duplicate = (int) pair.getKey();
                    System.out.println( "duplicate " +duplicate );
                }

            }
            return new int[] {duplicate, missing };


    }

}
