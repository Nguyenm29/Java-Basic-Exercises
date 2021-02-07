package JavaBasicExercies51_100;

public class JavaBasicExercies66 {
	public static boolean check(int num) {
		if(num <2) {
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(num);++i) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for (int i = 0; i <=100; i++) {
			if(check(i)) {
				sum+=i;
			}
		}
		System.out.println("Result: "+ sum);
	}

}
