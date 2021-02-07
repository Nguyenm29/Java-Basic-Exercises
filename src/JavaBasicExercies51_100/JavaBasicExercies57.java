package JavaBasicExercies51_100;


import java.util.Scanner;

public class JavaBasicExercies57 {
public static void main(String[] args) {
	int ctr =0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number: ");
	int num = scanner.nextInt();
	for (int i = 1; i <= Math.sqrt(num); i++) {
		if(num % i ==0 && i*i != num) {
			ctr+=2;
		}
		else if(i*i == num) {
			ctr ++;
		}
	}
	System.out.println("Result: "+ctr);
}
}
