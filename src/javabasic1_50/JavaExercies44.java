package javabasic1_50;

import java.util.Scanner;

public class JavaExercies44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int num = scanner.nextInt();
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("5");
			}
			if(i<=2)
			System.out.print(" + ");
		}
	}

}
