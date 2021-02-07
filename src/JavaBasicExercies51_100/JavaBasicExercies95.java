package JavaBasicExercies51_100;

import java.util.Arrays;

public class JavaBasicExercies95 {
public static void main(String[] args) {
	int n= 5;
	String[] arrStr = new String[n];
	for (int i = 0; i < arrStr.length; i++) {
		arrStr[i] = String.valueOf(i);
	}
	System.out.println("Arrays : "+ Arrays.toString(arrStr));
}
}
