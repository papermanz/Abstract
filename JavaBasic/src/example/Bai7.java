package example;

import java.util.Scanner;
/*
 * Viết chương trình để nhập một số nguyên, tìm kết quả phép nhân của số đó 
 * với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
 */

public class Bai7 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập vào số nguyên");
		n = sc.nextInt();
		for(int i = 1; i<=20; i++) {
			System.out.println(n +" x "+ i + " = "+n * i);
		}
		

	}

}
