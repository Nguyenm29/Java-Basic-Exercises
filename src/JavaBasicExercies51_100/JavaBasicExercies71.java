package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies71 {
public static String concatenation(String str1, String str2) {
	return str1.substring(1) + str2.substring(1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input a first string: ");
		String str1 = in.nextLine();
		System.out.println("Input a first string: ");
		String str2 = in.nextLine();
		System.out.println(concatenation(str1, str2));
	}

}
