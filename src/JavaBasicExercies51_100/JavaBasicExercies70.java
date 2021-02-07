package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First string: ");
		String string1 = in.nextLine();
		System.out.println("Second string: ");
		String string2 = in.nextLine();
		String result = "";
		if(string1.length() > string2.length()) {
			result = string2+string1+string2;
		}
		else if (string1.length() < string2.length()) {
			result = string1+string2+string1;
		}
		System.out.println(result);
	}

}
