package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises7 {
public static void main(String[] args) {
	Scanner in  = new Scanner(System.in);
	System.out.println("Input a number: ");
	int num = in.nextInt();
	System.out.println();
	for (int i = 1; i <= 10; i++) {
		System.out.println(num+"x"+i+"="+num*i);
	}
}
}
