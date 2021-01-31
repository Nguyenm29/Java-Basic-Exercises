package javabasic1_50;
import java.util.Scanner;

public class JavaBasicExercises25 {
// octal to decimal
	public static void main(String[] args) {
		System.out.println("Input octal number: ");
		Scanner sc = new Scanner(System.in);
		int octalNum  = sc.nextInt();
		int decimalNum = 0;
		int rem;
		int i = 0;
		while (octalNum!=0) {
			rem = octalNum%10;
			decimalNum+= rem * Math.pow(8, i++);
			octalNum = octalNum/10;
		}
		System.out.println("Result: " + decimalNum);
	}
}
