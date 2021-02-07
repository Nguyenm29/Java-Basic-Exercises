/*/**
 * 
 */
package JavaBasicExercies51_100;

import java.util.Scanner;

/**
 * @author chien
 *
 */
public class JavaBasicExercies69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =  new Scanner(System.in);
		String str;
		do {
			System.out.println("Input a string (6 charactor)");
			str = in.nextLine();
		} while (str.length() % 2 != 0);
		String substr = str.substring(0, str.length()/2);
		System.out.println(substr);
	}
}
