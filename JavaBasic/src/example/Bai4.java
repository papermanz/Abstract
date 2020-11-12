package example;
/*
 * Kiểm tra có phải tam giác vuông
 */

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập số a");
		a = sc.nextFloat();
		System.out.println("Mời nhập số b");
		b = sc.nextFloat();
		System.out.println("Mời nhập số c");
		c = sc.nextFloat();
		if(a * a + b * b == c * c ||a * a + c * c == b * b ||a * a + b * b == c * c) {
			System.out.println("Đây là 3 cạnh của tam giác vuông 3");
		}else {
			System.out.println("Đây không là cái khỉ gì cả");
		}

	}

}
