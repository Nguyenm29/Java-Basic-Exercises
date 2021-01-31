package javabasic1_50;

import java.util.Iterator;
import java.util.Scanner;

public class JavaBasicExercises37 {
	public static String reverseString(String s) {
		String result="";
		char[] letters = s.toCharArray();
		for (int i = letters.length-1; i >=0; i--) {
			result+=letters[i];
		}
		return result;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a string: ");
	String s = sc.nextLine();
	System.out.println("Reverse string: "+reverseString(s));
}
}
