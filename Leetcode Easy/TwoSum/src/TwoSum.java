import java.util.Arrays;

/* Name: Joseph Dadic
 * 
 * 
 * 
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target.
 * 
 *You may assume that each input would have exactly one solution, and you may not
 *use the same element twice.
 *You can return the answer in any order.
 *
 *
 **/
public class TwoSum {
	static public int[] twoSum(int[] nums, int target) {
		int[] tempArray = new int[2]; // Create a temporary array to store value.
		
		for(int i = 0; i < nums.length; i++) {
			for(int k = 0; k < nums.length; k++) {
			if(nums[k] + nums[i] == target && k != i) {
				tempArray[0] = k;
				tempArray[1] = i;
			}
			}
		}
		return tempArray;
	}
	public static void main(String[] args) {
		/* Will create test cases for twoSum below */
		
		int targetOne = 9;
		int targetTwo = 6;
		int targetThree = 4;
		int[] arrayOne = {2,7,11,15}; //Output should be [0,1]
		int[] arrayTwo = {3,3};      //Output should be [0,1]
		int[] arrayThree = {2,4,2,6}; //Output should be [0,2]
		
		System.out.println(Arrays.toString(twoSum(arrayOne, targetOne)));
		System.out.println(Arrays.toString(twoSum(arrayTwo, targetTwo)));
		System.out.println(Arrays.toString(twoSum(arrayThree, targetThree)));

	}

}
