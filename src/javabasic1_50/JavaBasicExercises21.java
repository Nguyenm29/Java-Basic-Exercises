package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter decimal number: ");
		int decimalNum = in.nextInt();
		int remainder = 0;
		int i =0;
		int[] octalNum = new int[20];
		while (decimalNum != 0) {
			remainder = decimalNum%8;
			octalNum[i++] = remainder;
			decimalNum = decimalNum/8;
		}
		i--;
		System.out.println("octal number: ");
		while (i>=0) {
			System.out.print(octalNum[i--]);
		}
	}

}
