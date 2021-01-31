package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises12 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Numner 1: ");
	int num1 = in.nextInt();
	System.out.println("Numner 2: ");
	int num2 = in.nextInt();
	System.out.println("Numner 3: ");
	int num3 = in.nextInt();
	System.out.println("the average of the numbers:"+(num1+num2+num3)/3);
}
}
