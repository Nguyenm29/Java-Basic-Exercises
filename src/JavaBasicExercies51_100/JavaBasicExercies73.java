package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies73 {
	public static String test(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			if (str1.length() == 0) {
				return "#" + str2.charAt(0);
			} else if (str2.length() == 0) {
				return str1.charAt(0) + "#";
			} else {
				return "##";
			}
		}
		return str1.charAt(0)+ " " + str2.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input first string :");
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		System.out.println("Input first string :");
		String str2 = in.nextLine();
		System.out.println("Result: " + test(str1, str2));
	}

}
