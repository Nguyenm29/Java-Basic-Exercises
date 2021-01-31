package javabasic1_50;

import java.util.Scanner;
 
public class JavaBasicExercises34 {
	public static double hexagonArea(double s) {
		return (6*(s*s))/(4*Math.tan(Math.PI/6));
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input the lengh of a side of the hexagon:");
	double s = sc.nextDouble();
	System.out.println("The area of the hexagon is: "+hexagonArea(s));
}
}
