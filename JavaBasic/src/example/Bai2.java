package example;

import java.util.Scanner;
/*
 * Kiểm tra số thành chuỗi
 */

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Nhập số cần chuyển");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		switch(n){
			case 0:
				System.out.println("số Không");
				break;
			case 1:
				System.out.println("Một");
				break;
			case 2:
				System.out.println("Hai");
				break;
			case 3:
				System.out.println("Ba");
				break;
			case 4:
				System.out.println("Bốn");
				break;
			case 5:
				System.out.println("Năm");
				break;
			case 6:
				System.out.println("Sáu");
				break;
			case 7:
				System.out.println("Bảy");
				break;
			case 8:
				System.out.println("Tám");
				break;
			case 9:
				System.out.println("Chín");
				break;
			case 10:
				System.out.println("Mười");
				break;
			default:
				System.out.println("Số nhập chưa đúng");
				
		}

	}

}
