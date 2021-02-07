package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies68 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = "";
	do {
		System.out.println("Input a string: ");
		str = in.nextLine();
	} while (str.length() < 3);
	String lastString = str.substring(str.length() - 3);
	System.out.println("Result: "+lastString+lastString+lastString);
}
}
