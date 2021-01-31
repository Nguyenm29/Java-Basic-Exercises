package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int num1 = in.nextInt();
	System.out.println("Enter second number: ");
	int num2 = in.nextInt();
	System.out.println(num1 + "*" + num2 + "=" + num1*num2 );
}
}
