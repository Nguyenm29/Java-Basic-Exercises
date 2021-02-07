package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies87 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Original number: ");
	int num = sc.nextInt();
	int sumOfDigit = 0;
	int digit = 0;
	String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	while (num != 0) {
		digit = num%10;
		sumOfDigit += digit;
		num = num /10;
	}
	System.out.println(sumOfDigit);
	System.out.println();
	while (sumOfDigit != 0) {
		sumOfDigit = sumOfDigit%10;
		System.out.print(number[sumOfDigit]+" ");
		sumOfDigit/=10;
	}
}
}
