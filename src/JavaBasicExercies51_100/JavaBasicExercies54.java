package JavaBasicExercies51_100;

import java.util.Scanner;
public class JavaBasicExercies54 {
	public static boolean check(int fistNum, int secondNum, int thirdNum) {
		if (fistNum % 10 != secondNum%10 && secondNum%10 != thirdNum%10 && thirdNum%10 != fistNum%10) {
			return false;
		}
		return true;
	}
	//return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input the first number: ");
	int fisrtNum = in.nextInt();
	System.out.println("Input the second number: ");
	int secondNum = in.nextInt();
	System.out.println("Input the third number: ");
	int thirdNum = in.nextInt();
	System.out.println("The result: " + check(fisrtNum, secondNum, thirdNum));
	
}
}
