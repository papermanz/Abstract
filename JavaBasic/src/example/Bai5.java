package example;

import java.util.Scanner;

/*
 * Check mã sinh viên có dạng Bxxxxx với x = 1 -> 9
 */

public class Bai5 {
	public static void main(String[] args) {
		String MSSV;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào mã số sinh viên: ");
		MSSV = sc.nextLine();
		if(MSSV.matches("B\\d{7}")) { //biểu thức đệ quy \d là các số ngẫu nhiên 0->9, {7} lặp lại 7 lần 
			System.out.println("Khớp mã số sinh viên");
		}else {
			System.out.println("không phải mã số sinh viên");
		}
		
	}
	
}
