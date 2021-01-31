package javabasic1_50;

import java.util.Scanner;

public class JavaBasicExercises20 {
	public static void main(String[] args) {
		int dec_num, rem;
		String hexdec_num="";
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B','C','D','E','F'};
		Scanner in = new Scanner(System.in);
		System.out.println("Enter decimal: ");
		dec_num = in.nextInt();
		
		while (dec_num>0) {
			rem = dec_num%16;
			hexdec_num = hex[rem] + hexdec_num;
			dec_num = dec_num/16;
		}
		System.out.println("result "+hexdec_num);
		/*
		int rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("decimal number: ");
		int decimal = sc.nextInt();
		char hexdec_num[] = new char[30];
		int i = 0;
		while (decimal != 0) {
			rem = (int)(decimal % 16);
			decimal = (int)(decimal / 16);
			if (rem <= 9) {
				hexdec_num[i++] = (char)(rem+'0');
			} else {
				switch (rem) {
				case 10:
					hexdec_num[i++] = 'A';
					break;
				case 11:
					hexdec_num[i++] = 'B';
					break;
				case 12:
					hexdec_num[i++] = 'C';
					break;
				case 13:
					hexdec_num[i++] = 'D';
					break;
				case 14:
					hexdec_num[i++] = 'E';
					break;
				case 15:
					hexdec_num[i++] = 'F';
					break;
				default:
					break;
				}
			}
		}
		System.out.println("Result: ");
		i--;
		while (i>=0) {
			System.out.print(hexdec_num[i--]);
		}*/
	}
}
