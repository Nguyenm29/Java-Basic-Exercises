package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies51 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input a number (type string): ");
	String str = in.nextLine();
	int result = Integer.parseInt(str);
	System.out.println("result " + result);
}
}
