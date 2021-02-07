package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies63 {
	public static int test(int num1,int num2) {
		if(num1 == num2)
			return 0;
		if (num1 % 6 == num2 % 6) {
			return (num1 < num2) ? num1 : num2;
		}
		return (num1 > num2) ? num1 :  num2;
	}
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input first number: ");
	int firstNum = in.nextInt();
	System.out.println("Input second number: ");
	int secondNum = in.nextInt();	
	System.out.println(test(firstNum, secondNum));
	}
}
