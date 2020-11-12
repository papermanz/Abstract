package example;

import java.util.Scanner;

/*
 * nhập số nguyên dương n, tính tổng các số chẵn trong khoảng từ 0 đến n
 */
public class Bai6 {

	public static void main(String[] args) {
		int sum = 0;
		int n;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập vào số n : ");
		n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Tổng các số chẵn từ 0 -> "+n+" là : "+ sum);

	}

}
