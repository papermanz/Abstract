package example;

import java.util.Scanner;
/*
 * Kiểm tra số nguyên dương
 */

public class Bai1 {

	public static void main(String[] args) {
		int n;
		System.out.println("Nhập số cần kiểm tra");
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		if(n>=0) {
			System.out.println("Đây là số nguyên dương");
		}else {
			System.out.println("Đây là số nguyên âm");
		}
	}

}
