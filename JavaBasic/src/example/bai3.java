package example;

import java.util.Scanner;
/*
 * Kiểm tra có phải 3 cạnh của tam giác
 * 
 */

public class bai3 {

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
		if(a < b + c && b < a + c && c < a + b) {
			System.out.println("Đây là 3 cạnh của tam giác");
		}else {
			System.out.println("Đây không là cái khỉ gì cả");
		}

	}

}
