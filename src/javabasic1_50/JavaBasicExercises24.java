package javabasic1_50;

import java.util.Iterator;
import java.util.Scanner;

public class JavaBasicExercises24 {
	public static int binaryToOctal(int binNum) {
		int octNum[] = new int[100];
		int binNum1= binNum;
		int rem;
		int decNum = 0;
		int i = 1;
		while (binNum1 > 0) {
			rem = binNum1%10;
			decNum+=rem*i;
			i*=2;
			binNum1 /=10;
		}
		
		i = 1;
		int quot = decNum;
		while (quot > 0) {
			octNum[i++] = quot %8;
			quot /=8;
		}
		i--;
		int result = 0;
		while (i>0) {
			result = result*10 + octNum[i--];
		}
		return result ;
	}
public static void main(String[] args) {
	// convert a binary number to a octal number
	Scanner in = new Scanner(System.in);
	System.out.println("Input a binary number: ");
	int binaryNum = in.nextInt();
	System.out.println("Octal number: "+binaryToOctal(binaryNum));
}
}
