package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises38 {
	public static void countString(String s) {
		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int others = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letters++;
			} else if (Character.isDigit(ch[i])) {
				numbers++;
			} else if (Character.isSpaceChar(ch[i])) {
				spaces++;
			} else {
				others++;
			}
		}
		System.out.println("string: " + s);
		System.out.println("Letter " + letters);
		System.out.println("Space " + spaces);
		System.out.println("Number " + numbers);
		System.out.println("Oher " + others);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a string: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		countString(str);
	}

}
