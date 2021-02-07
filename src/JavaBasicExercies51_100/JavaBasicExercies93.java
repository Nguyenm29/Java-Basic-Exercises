package JavaBasicExercies51_100;

import java.util.Arrays;

public class JavaBasicExercies93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 10, 2, 4, 20, 20};
		int ctr_even = 0, ctr_odd =  0;
		System.out.println("Original Array: "+ Arrays.toString(nums));
		boolean found1010 = false;
		boolean found2020 = false;
		for(int i = 0; i<nums.length - 1;++i) {
			if(nums[i] == nums[i+1] && nums[i] == 10) {
				found1010 = true;
			}
			if(nums[i] == nums[i+1] && nums[i] == 20) {
				found2020 = true;
			}
		}
		System.out.println(String.valueOf(found1010 != found2020));
	}
}
