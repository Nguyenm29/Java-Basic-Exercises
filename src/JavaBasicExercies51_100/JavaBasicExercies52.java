package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Input the first number: ");
int fisrtNum = in.nextInt();
System.out.println("Input the second number: ");
int secondNum = in.nextInt();
System.out.println("Input the third number: ");
int thirdNum = in.nextInt();
if(fisrtNum + secondNum == thirdNum) {
	System.out.println("true");
}
else {
	System.out.println("False");
}
	}

}
