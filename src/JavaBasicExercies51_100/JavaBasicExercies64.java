package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies64 {
	public static boolean check(int fistNum , int secondNum) {
		int num1 = fistNum, num2 = secondNum;
		num1 = num1%10;
		fistNum /=10;
		num2 = num2%10;
		secondNum /=10;
		return (num1 == num2 || num1 ==secondNum || fistNum==num2 || fistNum == secondNum);
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("First number: ");
	int num1 = in.nextInt();
	System.out.println("Second numner: ");
	int num2 = in.nextInt();
	System.out.println(check(num1, num2));
}
}
