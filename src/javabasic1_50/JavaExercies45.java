package javabasic1_50;

import java.io.File;

public class JavaExercies45 {
public static void main(String[] args) {
	// find the size if specified file
	System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
	  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
}
}
