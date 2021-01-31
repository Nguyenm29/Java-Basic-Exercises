package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises23_2 {
	public static void main(String[] args) {
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0, bin;
		System.out.println("In put a Binary Number: ");
		Scanner in = new Scanner(System.in);
		bin = in.nextInt();
		while (bin > 0) {
			rem = bin % 2;
			dec = dec + rem * i;
			i *= 2;
			bin /= 10;
		}
		i = 0;
		while (dec != 0) {
			hex[i] = dec % 16;
			dec /= 16;
			i++;
		}
		System.out.println("HexaDecimal value: ");
		for (j = i - 1; j >= 0; j--) {
			if (hex[j] > 9) {
				System.out.print((char) (hex[j] + 55));
			} else {
				System.out.print(hex[j]);
			}
		}
	}
}
