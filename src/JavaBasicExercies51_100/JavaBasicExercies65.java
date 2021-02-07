package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First number: ");
		int num1 = in.nextInt();
		System.out.println("Second number: ");
		int num2 = in.nextInt();
		int x = num1/num2;
		int div = num1 - x*num2;
		System.out.println("Result: "+div);
	}

}
