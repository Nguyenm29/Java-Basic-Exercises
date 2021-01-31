package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises33 {
public static void main(String[] args) {
	int number;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integer number: ");
	number = sc.nextInt();
	int result = 0;
	int digit;
	while (number!=0) {
		digit = number%10;
		result+=digit;
		number/=10;
	}
	System.out.println("Result = " +result);
}
}
