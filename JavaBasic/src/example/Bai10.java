package example;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		String Mssv;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++) {
		System.out.println("Nhập mã sinh viên");
		Mssv = sc.nextLine();
		if(Mssv.matches("B170\\d{4}")) {
			System.out.println("Đây là mã số sinh viên");
		}else {
			System.out.println("nhập nhầm số lô tô vào à !! ");
		}
		}
	}

}
