package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies86 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input a number: ");
	int n = in.nextInt();
	int count = 0 ;
	while (n!=1) {
		System.out.println(n);
		if(n%2 == 0) {
			n /=2;
			count++;
		}
		else {
			n = (n*3 + 1)/2;
			count++;
		}
	}
	System.out.println("Time: "+count);
}
}
