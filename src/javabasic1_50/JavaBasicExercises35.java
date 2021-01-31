package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises35 {
	public static double polygonArea(double s, double n){
		return ((n*Math.pow(s, 2))/(4*Math.tan(Math.PI/n)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the lengh of the polygon: ");
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		System.out.println("Input the number of size:");
		double n = sc.nextDouble();
		System.out.println("Area of the polygon: "+polygonArea(s,n));
	}

}
