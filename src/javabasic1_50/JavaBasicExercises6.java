package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises6 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter first number: ");
	int firstNum = in.nextInt();
	System.out.println("enter second number: ");
	int secondNum = in.nextInt();
	System.out.println(firstNum + "+" + secondNum + "=" +(firstNum+secondNum));
	System.out.println(firstNum + "-" + secondNum + "=" +(firstNum-secondNum));
	System.out.println(firstNum + "*" + secondNum + "=" +(firstNum*secondNum));
	System.out.println(firstNum + "/" + secondNum + "=" +(firstNum/secondNum));
	System.out.println(firstNum + "%" + secondNum + "=" +(firstNum%secondNum));
}
}
