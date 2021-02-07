package JavaBasicExercies51_100;


import java.util.Arrays;

public class JavaBasicExercies94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
		System.out.println("Original array: "+ Arrays.toString(array_nums));
		for (int i = 0; i < array_nums.length -1; i++) {
			for (int j = i+1; j < array_nums.length; j++) {
				if(array_nums[i]%2 == 0 && array_nums[j]%2 == 1) {
					int temp = array_nums[i];
					array_nums[i] = array_nums[j];
					array_nums[j] = temp;
				}
			}
		}
		System.out.println("The result: "+ Arrays.toString(array_nums));
	}

}
