package JavaBasicExercies51_100;

import java.util.Scanner;

// find the number of integer within the range of two specified number and that are divisible by another number
public class JavaBasicExercies56 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input number x: ");
	int x = sc.nextInt();
	System.out.println("Input number y: ");
	int y = sc.nextInt();
	System.out.println("Input number p: ");
	int p = sc.nextInt();
	int count = 0;
	for (int i = x; i <=y ; i++) {
		if (i%p == 0) {
			count++;
		}
	}
	System.out.println(count);
}
}
