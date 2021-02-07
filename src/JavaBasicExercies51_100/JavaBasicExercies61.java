package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies61 {
public static void main(String[] args) {
	System.out.println("Input a string: ");
	Scanner in =  new Scanner(System.in);
	String line = in.nextLine();
	char[] ch = line.toCharArray();
	String result = "";
	for (int i = ch.length-1; i>=0; i--) {
		result+=ch[i];
	}
	System.out.println("result: "+result.trim());
}
}
