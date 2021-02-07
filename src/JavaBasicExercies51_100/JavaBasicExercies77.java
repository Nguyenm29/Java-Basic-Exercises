package JavaBasicExercies51_100;

import java.util.Arrays;

public class JavaBasicExercies77 {
public static void main(String[] args) {
    int[] array1 = {50, -20, 0};
	int[] array2 = {5, -50, 10};
	System.out.println("Array1: "+Arrays.toString(array1));
	System.out.println("Array2: "+Arrays.toString(array2));
	int[] newArray = {array1[0], array2[2]};
	System.out.println("New array: "+ Arrays.toString(newArray));
}
}
