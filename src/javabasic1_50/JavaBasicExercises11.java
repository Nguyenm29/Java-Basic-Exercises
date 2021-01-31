package javabasic1_50;
import java.util.Scanner;

public class JavaBasicExercises11 {
	private static final double radius = 7.5;
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Perimeter is: "+ 2*Math.PI*radius);
	System.out.println("Area is: "+ Math.PI * Math.pow(radius, 2));
}
}
