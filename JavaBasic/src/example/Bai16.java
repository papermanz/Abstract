package example;

import java.util.Scanner;
/*
 * Kiểm tra trong chuỗi có kí tự cần tìm hay không ?
 */

public class Bai16 {

	public static void main(String[] args) {
		String n;
		char a;	
		boolean tonTai = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		n = sc.nextLine();
		System.out.println("Nhập vào kí tự cần kiểm tra: ");
		a = sc.nextLine().charAt(0);
		
		char MangKiTu[] = n.toCharArray();
		for(int i = 0; i < MangKiTu.length; i++) {
			if(a == MangKiTu[i]) {
				System.out.println("Có kí tự "+a+" Trong chuỗi cần tìm");
				tonTai = true;
			}
			}
			if(tonTai == false) {
				System.out.println("Không có kí tự cần tìm trong chuỗi");
			}
		}
}


