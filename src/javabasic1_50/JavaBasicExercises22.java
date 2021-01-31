package javabasic1_50;

import java.util.Iterator;
import java.util.Scanner;

public class JavaBasicExercises22 {
// covert binary number to decimal number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter bianary number: ");
		int binaryNum = sc.nextInt();
		int digit;
		int decimalNum = 0;
		int i = 1;
		while (binaryNum!=0) {
			digit = binaryNum%10;
			decimalNum+=digit * i;
			i*=2;
			binaryNum = binaryNum/10;
		}
		System.out.println("decimal number: "+decimalNum);
	}
}
