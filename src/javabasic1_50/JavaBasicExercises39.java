package javabasic1_50;

public class JavaBasicExercises39 {
public static void main(String[] args) {
	int count =0;
	for (int i = 1; i <= 4; i++) {
		for (int j = 1; j <=4 ; j++) {
			for (int j2 = 1; j2 <=4; j2++) {
				if(i!=j && j!=j2 && i!=j2) {
					count ++;
					System.out.println(i+""+j+"j2");
				}
			}
		}
	}
	System.out.println("total number of the three digit number is "
			+ ""+count);
}
}
