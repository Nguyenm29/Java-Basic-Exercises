package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises23 {
// binary number to hexadecimal
	public static void main(String[] args) {
		// chuyen tu he hai sang he 10 sau do chuyen tu he 10 sang he 16
		// TODO Auto-generated method stub
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
		int rem;
		String hexdec_num="";
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B','C','D','E','F'};
		while (decimalNum!=0) {
			rem = decimalNum%16;
			hexdec_num = hex[rem] + hexdec_num;
			decimalNum = decimalNum/16;
		}
		System.out.println("result "+hexdec_num);
	}
}


