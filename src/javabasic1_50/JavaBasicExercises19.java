package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises19 {
// Write a Java program to convert a decimal number to binary number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter deciml: ");
		int decimal = in.nextInt();
		int  i = 0;
		int num[] = new int[20];
		while (decimal != 0) {
			num[i++] = decimal%2;
			decimal =(int)decimal/2;
		}
		i--;
		System.out.println("result");
		while (i>=0) {
		System.out.print(num[i--]);
		}
	}

}
