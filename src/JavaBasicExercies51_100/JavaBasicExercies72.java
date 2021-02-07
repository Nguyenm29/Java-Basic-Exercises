package JavaBasicExercies51_100;

import java.util.Scanner;

public class JavaBasicExercies72 {
	// Viết chương trình Java để tạo một chuỗi mới lấy ba ký tự đầu tiên từ một chuỗi đã cho. Nếu độ dài của chuỗi đã cho nhỏ hơn 3, hãy sử dụng "#" làm ký tự thay thế.
public static String test(String string) {
	if(string.length() < 3) {
		return "###";
	}
	else {
		return string.substring(0, 3);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String str = sc.nextLine();
		System.out.println(test(str));
	}

}
