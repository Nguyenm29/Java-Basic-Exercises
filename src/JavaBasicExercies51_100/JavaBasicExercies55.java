package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies55 {
	public static String secondToHour(int second) {
		String result = "";
		int min = 0;
		int secondd = second % 60;
		min = second / 60;
		int hour = min /60;
		min = min %60;
		result = hour + ":" + min +":" + secondd;
		return result;
	}
public static void main(String[] args) {
	System.out.println("Input second: ");
	Scanner scanner = new Scanner(System.in);
	int second  = scanner.nextInt();
	System.out.println("Result: "+secondToHour(second));
}
}
