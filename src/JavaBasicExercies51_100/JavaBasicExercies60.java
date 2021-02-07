package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies60 {
	public static void main(String[] args) {
		System.out.println("Input a string: ");
		Scanner in =  new Scanner(System.in);
		String line = in.nextLine();
		String[] words = line.split("[ ]+");
		System.out.println("Penultimate word:"+words[words.length - 2]);
		
	}
	// find the penultimate (next to last) word of a sentence
	/*
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String line = in.nextLine();
		String upper_case_line = "";
		Scanner lineScan = new Scanner(line);
		String[] word = new String[100];
		int i = 0;
		while (lineScan.hasNext()) {
			word[i++] = lineScan.next();
		}
		System.out.println(word[i-2]);
	}
	*/
}
