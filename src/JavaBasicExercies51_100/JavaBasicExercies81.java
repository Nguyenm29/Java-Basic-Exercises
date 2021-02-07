package JavaBasicExercies51_100;

import java.util.Arrays;

public class JavaBasicExercies81 {
public static void main(String[] args) {
	int[] arr = {20, 30, 40};
	int[] newArr = new int[3];
	
	newArr[0]  = arr[2];
	newArr[2] = arr[0];
	newArr[1]  = arr[1];
	System.out.println("The result: "+ Arrays.toString(newArr));
}
}
