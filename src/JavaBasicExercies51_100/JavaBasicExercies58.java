package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies58 {
	public static String upcase(String line) {
		String upcaseLine = "";
		String[] words = line.split("[ ]+");
		for (String obj : words) {
			upcaseLine += Character.toUpperCase(obj.charAt(0))+obj.substring(1)+" ";
		}
		return upcaseLine = upcaseLine.trim();
	}
public static void main(String[] args) {
	// capitalize the first letter of each word in sentence
	Scanner in = new Scanner(System.in);
    System.out.print("Input a Sentence: ");
	 String line = in.nextLine();
	 /*
	 String upper_case_line = ""; 
      Scanner lineScan = new Scanner(line); 
        while(lineScan.hasNext()) {
            String word = lineScan.next(); 
            upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
        }
     System.out.println(upper_case_line.trim());
	 */
	 System.out.println("The result: " +upcase(line));
   }
}
