package example;

import java.util.Scanner;
/*
 * Kiểm tra chuỗi có chứa số hay không ?
 */

public class Bai18 {

	public static void main(String[] args) {
		String n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập vào chuỗi:");
		n = sc.nextLine();
		if(n.matches(".*\\d.*")){ //biểu thức chính quy check số 
			System.out.println("Trong chuỗi có số");
		}else {
			System.out.println("Không tồn tại số trong chuỗi");
		}

	}

}
