package example;

import java.util.Scanner;

public class Bai17 {

	public static void main(String[] args) {
		String n;
		CharSequence a;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập vào chuỗi");
		n = sc.nextLine();
		System.out.println("Nhập vào kí tự cần tìm:");
		a = sc.nextLine();
		if(n.contains(a) == true) {
			System.out.println("Trong chuỗi có chữ "+a+" đó mọi người ạ");
		int vt1 = n.indexOf(a+"");
			System.out.println("Vị trí của "+a+" trong chuỗi là "+(vt1+1));
		}else {
			System.out.println("Không tồn tại kí tự cần tìm trong chuỗi");
		}
		
	}


}
