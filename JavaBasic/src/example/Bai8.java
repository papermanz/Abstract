package example;

import java.util.Scanner;
/*
 * Tìm số nguyên tố trong khoảng n 
 */

public class Bai8 {

	public static void main(String[] args) {
		int n;
		boolean songuyento = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên n");
		n = sc.nextInt();
		System.out.println("1, 2");
		if(n<1000) {
			for(int i =3; i<=n;i++) {
				songuyento =true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					songuyento =false;
				}
			}
			if(songuyento == true) {
				System.out.println(i);
			}
			}
			
		}else {
			System.out.println("n phải nhỏ hơn 1000");
		}
	}

}
