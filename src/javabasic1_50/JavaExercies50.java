package javabasic1_50;

import java.util.Scanner;

public class JavaExercies50 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input number");
	int num = sc.nextInt();
	for(int i = num; i<= 100; ++i) {
		if(i % num == 0) {
			System.out.print(i+", ");
		}
	}
}
}
