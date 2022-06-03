import java.util.Arrays;

/* Name: Joseph Dadic
 * 
 * 
 * 
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * 
 *      
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first 
 * k elements of nums should hold the final result. It does not matter what you leave beyond
 * the first k elements.
 * 
 * Return k after placing the final result in the first k slots of nums.
 * 
 * Do NOT allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.*/



public class RemoveDuplicatesFromSortedArray {
	static public int removeDuplicates(int[] nums) {
		int counter = 0;
		for(int i = 0; i <=  nums.length; i++) {
			if(nums[i] == nums[i+1]) {
				nums[i+1] = nums[i];
			} else if(nums[i] < nums[i+1]) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(testArray));
		
	}

}
