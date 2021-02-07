package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies53 {
	public static boolean test(int p, int q, int r, boolean xyz)
    {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
    }
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input the first number: ");
	int fisrtNum = in.nextInt();
	System.out.println("Input the second number: ");
	int secondNum = in.nextInt();
	System.out.println("Input the third number: ");
	int thirdNum = in.nextInt();
	System.out.println("The result: " + test(fisrtNum, secondNum, thirdNum, true));
}
}
