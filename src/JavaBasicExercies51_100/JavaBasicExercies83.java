package JavaBasicExercies51_100;

import java.util.Arrays;

public class JavaBasicExercies83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,3,-5,4};
		int[] arr2 = {1,4,-5,-2};
		int[] arr3 = new int[4];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] * arr2[i];
		}
		System.out.println("The result: "+ Arrays.toString(arr3));
	}

}
